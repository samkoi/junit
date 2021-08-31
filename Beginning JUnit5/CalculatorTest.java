import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        double result = calc.add(40, 40);
        assertEquals(80, result, 0);
    }
}
