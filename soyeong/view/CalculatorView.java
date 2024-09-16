package view;

import java.io.IOException;

import exception.InputOutOfBoundsException;
import model.Calculator;

public class CalculatorView {

	public void printResult(Calculator calculator) throws IOException, InputOutOfBoundsException {
		int op1 = calculator.getOp1();
		int op2 = calculator.getOp2();
		String op = calculator.getOp();
		double result = 0;
		
		switch (op) {
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
			result = (double) op1 / (double) op2;
			isInfiniteOrNan(result);
			break;
		default:
			System.out.println("유효하지 않은 입력입니다.");
		}
	
		
		if (!(op.equals("/"))) {
			System.out.printf("%d %s %d = %d\n", op1, op, op2, (int) result);
		} else {
			System.out.printf("%d %s %d = %.2f\n", op1, op, op2, result);
		}
	}
	
	public static void isInfiniteOrNan(double result) throws InputOutOfBoundsException {
		if (Double.isInfinite(result) || Double.isNaN(result)) {
			throw new InputOutOfBoundsException();
		}
	}

}
