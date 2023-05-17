package router;

import exception.InvalidUserInput;
import model.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputRouter {

    public int getUserInput() throws IOException, InvalidUserInput {

        System.out.println("*** 숫자를 입력해 주세요 ! ***");
        System.out.println("*  1. 구구단             *");
        System.out.println("*  2. 계산기             *");
        System.out.println("*  3. 별찍기             *");
        System.out.println("************************");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userInput = br.readLine();

        if (userInput.equals("1")) {
            return 1; // TODO : ENUM으로 만들어보기!
        } else if (userInput.equals("2")) {
            return 2; // TODO : ENUM으로 만들어보기!
        } else if(userInput.equals("3")) {
            return 3; // TODO : ENUM으로 만들어보기!
        }
        throw new InvalidUserInput("잘못된 사용자 입력입니다.");
    }


    public boolean validNumberRange(int number) {
        return number >= 1 && number <= 999;
    }

    public boolean isInteger(String s){
        try{
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
