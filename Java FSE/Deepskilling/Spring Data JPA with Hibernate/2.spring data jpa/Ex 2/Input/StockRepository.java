public interface StockRepository extends JpaRepository<Stock, Integer> {

    // 1. Get all stock details of Facebook in Sep 2019
    List<Stock> findByCodeAndDateBetween(String code, LocalDate startDate, LocalDate endDate);

    // 2. Get all Google stocks with price > 1250
    List<Stock> findByCodeAndCloseGreaterThan(String code, BigDecimal price);

    // 3. Top 3 by volume (descending)
    List<Stock> findTop3ByOrderByVolumeDesc();

    // 4. Bottom 3 Netflix stocks by close price
    List<Stock> findTop3ByCodeOrderByCloseAsc(String code);
}
