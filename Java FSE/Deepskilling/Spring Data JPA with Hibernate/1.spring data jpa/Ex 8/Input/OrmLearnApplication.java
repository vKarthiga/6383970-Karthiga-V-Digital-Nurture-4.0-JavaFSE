testUpdateCountry()

private static void testUpdateCountry() {
    LOGGER.info("Start");

    try {
        countryService.updateCountry("XZ", "Xenovia");
        Country updatedCountry = countryService.findCountryByCode("XZ");
        LOGGER.debug("Updated Country: {}", updatedCountry);
    } catch (CountryNotFoundException e) {
        LOGGER.error("Exception: {}", e.getMessage());
    }

    LOGGER.info("End");
}
