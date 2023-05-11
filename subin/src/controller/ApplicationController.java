package controller;

import service.GugudanService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplicationController {

    private GugudanService gugudanService = new GugudanService();

    public void doGugudan() throws IOException {
        gugudanService.run();
    }


    public void doCalculator() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
    }

    public boolean validNumberRange(int number) {
        return number >= 1 && number <= 999;
    }

}
