public static void displayCountry() {
    LOGGER.info("START displayCountry()");

    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

    Country country = context.getBean("country", Country.class);
    Country anotherCountry = context.getBean("country", Country.class);  // Second call

    LOGGER.debug("Country : {}", country.toString());
    LOGGER.debug("Another Country : {}", anotherCountry.toString());

    LOGGER.info("END displayCountry()");
}
