package controller;

import service.CalculatorService;
import service.GugudanService;
import service.StarService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplicationController {

    private GugudanService gugudanService = new GugudanService();
    private CalculatorService calculatorService = new CalculatorService();
    private StarService starService =  new StarService();

    public void doGugudan() throws IOException {
        gugudanService.run();
    }

    public void doCalculator() throws IOException {
        calculatorService.run();
    }

    public void doStar() throws IOException {
        starService.run();
    }

    public boolean validNumberRange(int number) {
        return number >= 1 && number <= 999;
    }

}
