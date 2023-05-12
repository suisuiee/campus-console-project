package model;

import java.io.IOException;
import exception.InputOutOfBoundsException;

public class Calculator {

	String exp;
	private int op1, op2; // operand1, operand2
	private String op; // operator
	private double result = 0;

	public Calculator(int op1, String op, int op2) {
		this.op1 = op1;
		this.op = op;
		this.op2 = op2;
	}

	public void calculate() throws IOException {
		try{
			switch(op) {
			case "+":
				result = op1 + op2;
				break;
			case "-":
				result = op1 - op2;
				break;
			case "*":
				result = op1 * op2;
				break;
			case "/":
				result = (double)op1 / (double)op2;
				isInfiniteOrNan(result);
				break;
			default:
				System.out.println("유효하지 않은 입력입니다.");
				}
			
			if(!(op.equals("/"))) {
				System.out.printf("%d %s %d = %d\n", op1, op, op2, (int)result);
			}else {
				System.out.printf("%d %s %d = %.2f\n", op1, op, op2, result);
			}
			
			}catch(InputOutOfBoundsException e){ // 0으로 나눴을 때 발생
				System.out.println("0으로 나눌 수 없습니다.");
			}catch(NumberFormatException e){
				System.out.println("유효하지 않은 입력입니다.");
			}

	}

	public static void isInfiniteOrNan(double result) throws InputOutOfBoundsException {
		if (Double.isInfinite(result) || Double.isNaN(result)) {
			throw new InputOutOfBoundsException();
		}
	}
}