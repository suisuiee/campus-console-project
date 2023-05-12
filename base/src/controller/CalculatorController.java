package controller;

import model.Calculator;
import view.CalculatorView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorController {
    public void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            /**
             * controller 에서 사용자 입력 처리
             */
            System.out.println("첫번째 연산할 숫자를 입력해 주세요 !");
            String input1 = br.readLine();
            System.out.println("연산자를 입력해 주세요");
            String operator = br.readLine();
            System.out.println("두번째 연산할 숫자를 입력해 주세요 !");
            String input2 = br.readLine();

            if(!isInteger(input1) || !isInteger(input2)){
                throw new NumberFormatException();
            }

            /**
             * Controller -> Model 호출
             */
            Calculator calculator = new Calculator(Integer.parseInt(input1), Integer.parseInt(input2));
            calculator.setOp(operator.charAt(0));

            // 로직에서 나온 결과값을 result 에 담아서
            int result = calculator.calculate();

            /**
             * Controller -> View 호출
             */

            CalculatorView view = new CalculatorView();
            view.printResult(calculator, result);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }

    public boolean isInteger(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            return false;
        }
    }
}
