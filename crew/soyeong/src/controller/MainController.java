package controller;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import exception.InputOutOfBoundsException;


public class MainController {
	private int menuNum;
	private Scanner sc = new Scanner(System.in);

	public MainController() throws InputOutOfBoundsException {
		while (true) {
			printMenu();
			try {
				menuNum = sc.nextInt();
				if (menuNum == 1) {
					CalController calController = new CalController();
					calController.start();
				} else if (menuNum == 2) {
					TimesTableController timesTableController = new TimesTableController();
					timesTableController.start();
				} else if (menuNum == 3) {
					StarMakerController starMakerController = new StarMakerController();
					starMakerController.start();
				} else if (menuNum == 4) {
					break;
				}else { // 사용자 입력값이 1, 2, 3 외의 번호일 때 재입력 요청
					System.out.println("유효한 번호를 입력하세요.\n");
				}
			} catch (IOException e) {
				System.out.println(e);
			} catch (InputMismatchException e) {// 사용자 입력값이 숫자가 아닐 때 발생
				System.out.println("숫자를 입력하세요.\n");
			}
		}
		sc.close();
	}

	public static void printMenu() {
		System.out.println("<메뉴>");
		System.out.println("1. 계산기");
		System.out.println("2. 구구단 출력");
		System.out.println("3. 별찍기");
		System.out.println("4. 종료");
		System.out.println();
		System.out.print("실행할 기능 선택 > ");
	}

}
