Test for countries by substring

private static void testFindByNameContaining() {
    LOGGER.info("Start");

    List<Country> countries = countryService.findByNameContaining("ou");
    LOGGER.debug("Countries containing 'ou': {}", countries);

    LOGGER.info("End");
}

Test for countries by substring (sorted)

private static void testFindByNameContainingSorted() {
    LOGGER.info("Start");

    List<Country> countries = countryService.findByNameContainingSorted("ou");
    LOGGER.debug("Sorted countries containing 'ou': {}", countries);

    LOGGER.info("End");
}

Test for countries starting with a letter

private static void testFindByNameStartingWith() {
    LOGGER.info("Start");

    List<Country> countries = countryService.findByNameStartingWith("Z");
    LOGGER.debug("Countries starting with 'Z': {}", countries);

    LOGGER.info("End");
}
