package pro.sky.coursetwo.homeworktesting.service;

import org.springframework.stereotype.Service;
import pro.sky.coursetwo.homeworktesting.exception.NoArgumentSpecifiedException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int plus(int numOne, int numTwo) {
        checkingArgumentsForNull(numOne, numTwo);
        return numOne + numTwo;
    }

    @Override
    public int minus(int numOne, int numTwo) {
        checkingArgumentsForNull(numOne, numTwo);
        return numOne - numTwo;
    }

    @Override
    public int multiply(int numOne, int numTwo) {
        checkingArgumentsForNull(numOne, numTwo);
        return numOne * numTwo;
    }

    @Override
    public int divide(int numOne, int numTwo) {
        checkingArgumentsForNull(numOne, numTwo);
        if (numTwo == 0) {
            throw new IllegalArgumentException();
        }
        return numOne / numTwo;
    }

    private void checkingArgumentsForNull(Integer numOne, Integer numTwo) {
        if (numOne == null && numTwo == null) {
            throw new NoArgumentSpecifiedException();
        }
    }
}
