
package pkg10.bolum;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bolum10_20 {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i += 100) {
            System.out.println("i = " + i + " icin e degeri: " + getE(i));
        }
    }

    public static BigDecimal getE(int n) {
        BigDecimal e = BigDecimal.ONE;
        for (long i = 1; i <= n; i++) {
            BigDecimal denominator = factorial(i);
            BigDecimal term = BigDecimal.ONE.divide(denominator, 25, RoundingMode.UP);
            e = e.add(term);
        }
        return e;
    }

    public static BigDecimal factorial(long n) {
        BigDecimal result = BigDecimal.ONE;
        for (long i = 1; i <= n; i++) {
            result = result.multiply(new BigDecimal(i));
        }
        return result;
    }
}
