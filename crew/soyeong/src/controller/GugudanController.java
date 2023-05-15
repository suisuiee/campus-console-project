package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.InputOutOfBoundsException;
import model.Gugudan;
import view.GugudanView;

public class GugudanController {
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			/**
			 * controller 에서 사용자 입력 처리
			 */
			System.out.print("출력할 단 수를 입력해주세요. ");
			int num = sc.nextInt();

			setGugudan(num);

			/**
			 * Controller -> Model 호출
			 */
			Gugudan gugudan = new Gugudan(num);

			/**
			 * Controller -> View 호출
			 */
			GugudanView view = new GugudanView();
			view.printResult(gugudan);

		} catch (InputOutOfBoundsException e) {
			System.out.println("1과 999 사이의 수를 입력하세요.\n");
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요.\n");
		}

	}

	public static void setGugudan(int num) throws InputOutOfBoundsException {
		if (num < 1 || num > 999) {
			throw new InputOutOfBoundsException();
		}
	}
}