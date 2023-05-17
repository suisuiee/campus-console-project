package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import exception.InputOutOfBoundsException;
import model.Calculator;
import view.CalculatorView;

public class CalController {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private String exp, op;
	private int op1, op2;

	public CalController() throws IOException, InputOutOfBoundsException {
	}

	public void start() throws IOException, InputOutOfBoundsException {
		while (true) {
			try {
				System.out.print("\n연산식을 입력하세요. (ex. 1 + 2)\n(0 입력 시 계산기 종료)\n> ");
				exp = br.readLine();
				if (exp.equals("0")) {
					System.out.println();
					break;
				}

				StringTokenizer st = new StringTokenizer(exp);
				op1 = Integer.parseInt(st.nextToken());
				op = st.nextToken();
				op2 = Integer.parseInt(st.nextToken());

				Calculator calc = new Calculator(op1, op, op2);
				CalculatorView calView = new CalculatorView();
				calView.printResult(calc);

			} catch (NoSuchElementException e) { // 연산자나 피연산자 미입력했을 때 발생
				System.out.println("연산식을 정확하게 입력하세요.");
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
			} catch (InputOutOfBoundsException e) { // 0으로 나눴을 때 발생
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
	}
	public static void cal(int op1, int op2) throws InputOutOfBoundsException {
		if (op1 == 0 || op2 == 0) {
			throw new InputOutOfBoundsException();
		}
	}
}