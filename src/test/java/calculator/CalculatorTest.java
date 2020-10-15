package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    @Test
    public void createInstanceOfCalculator(){
        Calculator calc = new Calculator();
    }

    @Test
    public void inputTwoNumberAsStringAndReturnSumOfNumbers(){
        Calculator calc = new Calculator();

        var numbers = calc.SumNumbers("1,2");
        assertEquals(3, numbers);
    }

    @Test
    public void inputMoreThanTwoNumbersAndReturnSum(){
        Calculator calc = new Calculator();

        var numbers = calc.SumNumbers("1,2,1,1,1,1,1");
//        assertThat(8, equals(numbers));
//        assertThat(8, numbers);

    }

    @Test
    public void inputAnyCharsAndSumOnlyNumbers(){
        Calculator calc = new Calculator();

    }

}