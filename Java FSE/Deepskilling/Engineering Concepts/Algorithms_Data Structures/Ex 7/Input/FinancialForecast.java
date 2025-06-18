public class FinancialForecast {
    public static double futureValueRecursive(double presentValue, double rate, int periods) {
        if (periods == 0) return presentValue;
        return futureValueRecursive(presentValue * (1 + rate), rate, periods - 1);
    }

    public static double futureValueMemo(double presentValue, double rate, int periods, Double[] memo) {
        if (periods == 0) return presentValue;
        if (memo[periods] != null) return memo[periods];
        memo[periods] = futureValueMemo(presentValue, rate, periods - 1, memo) * (1 + rate);
        return memo[periods];
    }

    public static double futureValueIterative(double presentValue, double rate, int periods) {
        double result = presentValue;
        for (int i = 0; i < periods; i++) {
            result *= (1 + rate);
        }
        return result;
    }
}
