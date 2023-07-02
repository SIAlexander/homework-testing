package pro.sky.coursetwo.homeworktesting.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceImplParameterizedTest {

    CalculatorService calculatorService = new CalculatorServiceImpl();

    static Stream<Arguments> argumentsData() {
        return Stream.of(
                Arguments.of(12, 3),
                Arguments.of(15, 4),
                Arguments.of(20, 5));
    }

    @ParameterizedTest
    @MethodSource("argumentsData")
    void plus(int numOne, int numTwo) {
        int expected = numOne + numTwo;
        assertEquals(expected, calculatorService.plus(numOne, numTwo));
    }

    @ParameterizedTest
    @MethodSource("argumentsData")
    void minus(int numOne, int numTwo) {
        int expected = numOne - numTwo;
        assertEquals(expected, calculatorService.minus(numOne, numTwo));
    }

    @ParameterizedTest
    @MethodSource("argumentsData")
    void multiply(int numOne, int numTwo) {
        int expected = numOne * numTwo;
        assertEquals(expected, calculatorService.multiply(numOne, numTwo));
    }

    @ParameterizedTest
    @MethodSource("argumentsData")
    void divide(int numOne, int numTwo) {
        int expected = numOne / numTwo;
        assertEquals(expected, calculatorService.divide(numOne, numTwo));
    }
}
