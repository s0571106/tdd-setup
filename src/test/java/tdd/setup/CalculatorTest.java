package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {
    @Test
    @DisplayName("should display result after adding two positive numbers")
    void calculatorCanDoTwoPlusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("4", calc.readScreen());
    }

    @Test
    @DisplayName("should display the number 0 after pressing clear button")
    void calculatorCanClearResult() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        calc.pressClearKey();
        assertEquals("0", calc.readScreen());
    }


    @Test
    @DisplayName("should display result after adding a floating-point number")
    void calculatorCanHandleFloatingPointNumbers() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(1);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(1);
        calc.pressEquals();
        assertEquals("3.6", calc.readScreen());
    }


    @Test
    @DisplayName("should display result after adding floating-point numbers with 2 decimal places")
    void calculatorCanHandleNumbersWithTwoDecimalPlaces() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(1);
        calc.pressDigitKey(1);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        calc.pressDigitKey(5);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressDotKey();
        calc.pressDigitKey(1);
        calc.pressDigitKey(4);
        calc.pressEquals();
        assertEquals("13.69", calc.readScreen());
    }


}
