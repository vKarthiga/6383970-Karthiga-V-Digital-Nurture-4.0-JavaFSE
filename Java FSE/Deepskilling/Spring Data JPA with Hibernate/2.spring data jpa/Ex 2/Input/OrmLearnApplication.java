@Autowired
private static StockRepository stockRepository;

private static void testStockQueries() {
    LOGGER.info("Stock Query Tests Start");

    // 1. Facebook stocks in Sept 2019
    List<Stock> fbSept2019 = stockRepository.findByCodeAndDateBetween(
        "FB", LocalDate.of(2019, 9, 1), LocalDate.of(2019, 9, 30));
    LOGGER.debug("FB September 2019: {}", fbSept2019);

    // 2. Google stocks > 1250
    List<Stock> googHigh = stockRepository.findByCodeAndCloseGreaterThan("GOOGL", new BigDecimal("1250"));
    LOGGER.debug("GOOGL > 1250: {}", googHigh);

    // 3. Top 3 by volume
    List<Stock> topVolume = stockRepository.findTop3ByOrderByVolumeDesc();
    LOGGER.debug("Top 3 by Volume: {}", topVolume);

    // 4. Netflix lowest 3
    List<Stock> lowestNflx = stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX");
    LOGGER.debug("Lowest 3 NFLX: {}", lowestNflx);

    LOGGER.info("Stock Query Tests End");
}
