package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.InputOutOfBoundsException;
import model.TimesTable;
import view.TimesTableView;

public class TimesTableController {
	
	private Scanner sc = new Scanner(System.in);
	private int num;

	public TimesTableController() {
	}

	public void start() {
		
		while (true) {
			System.out.print("\n출력할 단 수를 입력하세요.\n(0 입력 시 구구단 출력 종료)\n> ");
			try {
				num = sc.nextInt();
				if (num == 0) {
					System.out.println();
					break;
				}
				printTt(num);
				
				TimesTable tt = new TimesTable(num);
				TimesTableView ttView = new TimesTableView();
				ttView.printTimesTable(tt);
				
			} catch (InputOutOfBoundsException e) { // 사용자 입력값이 1~999 범위를 벗어났을 때 발생
				System.out.println("1과 999 사이의 수를 입력하세요.");
			} catch (InputMismatchException e) { // 사용자 입력값이 숫자가 아닐 때 발생
				System.out.println("숫자를 입력하세요.");
				sc.nextLine();
			}
		}
	}

	public static void printTt(int num) throws InputOutOfBoundsException {
		if (num < 0 || num > 999) {
			throw new InputOutOfBoundsException();
		}
	}
}
