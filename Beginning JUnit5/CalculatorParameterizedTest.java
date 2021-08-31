import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.runners.Suite;
import org.junit.jupiter.api.runner.RunWith;
import org.junit.jupiter.api.Parameterized;
import java.util.Collection;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

@RunWith(value=Parameterized.class)
public class CalculatorParameterizedTest{
    private double expected;
    private double valueOne;
    private double valueTwo;

    @Parameterized.Parameters
    public static Collection<Integer[]> getTestParameters(){
        return Arrays.asList(new Integer[][]{
            {2,1,1}, {3,2,1}, {4,3,1},
        });
    }

    public CalculatorParameterizedTest(double expected, double valueOne, double valueTwo){
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Test
    public void sum(){
        Calculator calc = new Calculator();
        assertEquals(expected, calc.add(valueOne, valueTwo),0);
    }
}