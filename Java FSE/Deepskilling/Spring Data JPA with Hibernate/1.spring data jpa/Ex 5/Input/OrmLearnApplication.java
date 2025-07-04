@SpringBootApplication
public class OrmLearnApplication {

    private static CountryService countryService;

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        testFindCountryByCode();
        testAddCountry();
        testUpdateCountry();
        testDeleteCountry();
        testFindCountriesByPartialName();
    }

    private static void testFindCountryByCode() {
        LOGGER.info("Start testFindCountryByCode");
        Country c = countryService.findCountryByCode("IN");
        LOGGER.debug("Country: {}", c);
        LOGGER.info("End testFindCountryByCode");
    }

    private static void testAddCountry() {
        LOGGER.info("Start testAddCountry");
        Country c = new Country();
        c.setCode("ZZ");
        c.setName("Zootopia");
        countryService.addCountry(c);
        LOGGER.info("End testAddCountry");
    }

    private static void testUpdateCountry() {
        LOGGER.info("Start testUpdateCountry");
        countryService.updateCountry("ZZ", "Zooland");
        LOGGER.info("End testUpdateCountry");
    }

    private static void testDeleteCountry() {
        LOGGER.info("Start testDeleteCountry");
        countryService.deleteCountry("ZZ");
        LOGGER.info("End testDeleteCountry");
    }

    private static void testFindCountriesByPartialName() {
        LOGGER.info("Start testFindCountriesByPartialName");
        List<Country> list = countryService.findCountriesByPartialName("land");
        list.forEach(c -> LOGGER.debug("Country: {}", c));
        LOGGER.info("End testFindCountriesByPartialName");
    }
}
