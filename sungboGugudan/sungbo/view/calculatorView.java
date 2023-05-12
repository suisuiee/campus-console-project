package view;

import java.util.Scanner;

public class calculatorView {
    private Scanner scanner;

    public calculatorView() {
        scanner = new Scanner(System.in);
    }

    public void displayResult(int result) {
        System.out.println("Result: " + result);
    }

    public int getInputNumber() {
        System.out.print("숫자를 입력하세요: ");
        return scanner.nextInt();
    }

    public String getInputOperator() {
        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        return scanner.next();
    }

	public void calculatorMenu() {
    	System.out.println("계산기 서비스입니다");
    	System.out.println("숫자 두개와 연산자를 입력하면 계산을 합니다");
    	System.out.println("숫자 두개와 연산자를 입력해주세요");
    	System.out.println("==========================");
	}
}
