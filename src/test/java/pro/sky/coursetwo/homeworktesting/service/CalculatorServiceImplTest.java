package pro.sky.coursetwo.homeworktesting.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void helloCalculator() {
        String expected = calculatorService.helloCalculator();
        assertNotNull(expected);
    }

    @Test
    void plusPositive() {
        int expected = 6;
        int actual = calculatorService.plus(4, 2);
        assertEquals(expected, actual);
    }

    @Test
    void plusNegative() {
        int expected = -10;
        int actual = calculatorService.plus(-4, -6);
        assertEquals(expected, actual);
    }

    @Test
    void minusPositive() {
        int expected = 3;
        int actual = calculatorService.minus(6, 3);
        assertEquals(expected, actual);
    }

    @Test
    void minusNegative() {
        int expected = -13;
        int actual = calculatorService.minus(-10, 3);
        assertEquals(expected, actual);
    }

    @Test
    void multiplyPositive() {
        int expected = 8;
        int actual = calculatorService.multiply(4, 2);
        assertEquals(expected, actual);
    }

    @Test
    void multiplyNegative() {
        int expected = -36;
        int actual = calculatorService.multiply(-6, 6);
        assertEquals(expected, actual);
    }

    @Test
    void dividePositive() {
        int expected = 5;
        int actual = calculatorService.divide(10, 2);
        assertEquals(expected, actual);
    }

    @Test
    void divideNegative() {
        int expected = -4;
        int actual = calculatorService.divide(-20, 5);
        assertEquals(expected, actual);
    }

    @Test
    void divideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(20, 0);
        });
    }
}

