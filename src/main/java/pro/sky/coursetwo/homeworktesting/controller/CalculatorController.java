package pro.sky.coursetwo.homeworktesting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.coursetwo.homeworktesting.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int numOne,
                       @RequestParam("num2") int numTwo) {
        return numOne + " + " + numTwo + " = " + calculatorService.plus(numOne, numTwo);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int numOne,
                        @RequestParam("num2") int numTwo) {
        return numOne + " - " + numTwo + " = " + calculatorService.minus(numOne, numTwo);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int numOne,
                           @RequestParam("num2") int numTwo) {
        return numOne + " * " + numTwo + " = " + calculatorService.multiply(numOne, numTwo);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int numOne,
                         @RequestParam("num2") int numTwo) {
        return numOne + " / " + numTwo + " = " + calculatorService.divide(numOne, numTwo);
    }
}
