package view;

import model.Calculator;

public class CalculatorView {
    public void gugudanViewTest(){
        System.out.println("CalculatorView.gugudanViewTest");
    }
    /**
     * 계산 결과 출력
     * @param calculator
     */
    public void printResult(Calculator calculator,int result){
        int num1 = calculator.getNum1();
        int num2 = calculator.getNum2();
        char op = calculator.getOp();

        System.out.println("----------------------");
        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
        System.out.println("----------------------");
    }
}
