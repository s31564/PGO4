import java.math.BigDecimal;
import java.util.List;

public class Adder {

    public int add(int a, int b) {
        return a + b;
    }

    public BigDecimal add(List<BigDecimal> bigDecimals) {
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal bd : bigDecimals) {
            sum = sum.add(bd);
        }
        return sum;
    }


}