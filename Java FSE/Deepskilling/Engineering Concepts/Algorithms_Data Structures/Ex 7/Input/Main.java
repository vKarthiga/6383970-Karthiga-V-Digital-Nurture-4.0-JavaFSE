public class Main {
    public static void main(String[] args) {
        double presentValue = 1000.0;
        double rate = 0.05;
        int years = 5;

        System.out.println("🔁 Recursive Forecast: ₹" +
            FinancialForecast.futureValueRecursive(presentValue, rate, years));

        Double[] memo = new Double[years + 1];
        System.out.println("🧠 Memoized Forecast: ₹" +
            FinancialForecast.futureValueMemo(presentValue, rate, years, memo));

        System.out.println("🔃 Iterative Forecast: ₹" +
            FinancialForecast.futureValueIterative(presentValue, rate, years));
    }
}
