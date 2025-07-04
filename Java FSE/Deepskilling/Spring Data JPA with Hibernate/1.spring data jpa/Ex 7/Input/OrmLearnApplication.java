private static void testAddCountry() {
    LOGGER.info("Start");

    Country country = new Country();
    country.setCode("XZ");
    country.setName("Xanadu");

    countryService.addCountry(country);

    try {
        Country addedCountry = countryService.findCountryByCode("XZ");
        LOGGER.debug("Added Country: {}", addedCountry);
    } catch (CountryNotFoundException e) {
        LOGGER.error("Country not found: {}", e.getMessage());
    }

    LOGGER.info("End");
}
