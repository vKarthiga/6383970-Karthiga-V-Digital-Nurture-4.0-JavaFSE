public static void testGetAttemptDetails() {
    LOGGER.info("Start");

    Attempt attempt = attemptService.getAttempt(1, 100); // Example IDs
    LOGGER.debug("User: {}", attempt.getUser().getUsername());
    LOGGER.debug("Attempt Date: {}", attempt.getAttemptedDate());

    for (AttemptQuestion aq : attempt.getAttemptQuestions()) {
        LOGGER.info(aq.getQuestion().getText());

        List<Option> options = aq.getQuestion().getOptions();
        List<AttemptOption> attemptOptions = aq.getAttemptOptions();

        for (Option option : options) {
            boolean isSelected = attemptOptions.stream()
                .anyMatch(ao -> ao.getOption().getId() == option.getId() && ao.isSelected());
            LOGGER.info("{}\t{}\t{}", option.getText(), 
                        option.isCorrect() ? aq.getQuestion().getScore() : 0.0,
                        isSelected);
        }
    }

    LOGGER.info("End");
}
