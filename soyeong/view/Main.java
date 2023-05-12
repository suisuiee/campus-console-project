package view;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import controller.CalController;
import controller.TimesTableController;

public class Main {

	public static void main(String[] args) throws IOException {
		int menuNum;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			printMenu();
			System.out.print("실행할 기능 선택 > ");
			try {
				menuNum = sc.nextInt();
				
				if(menuNum == 1) {
					CalController calController = new CalController();
					calController.startCalculator();
				}else if(menuNum == 2) {
					TimesTableController timesTableController = new TimesTableController();
					timesTableController.StartMakingTimesTable();
				}else if(menuNum == 3) {
					break;
				}else { // 1, 2, 3 외의 번호 입력 시 번호 재입력 요청
					System.out.println("유효한 번호를 입력하세요.\n");
				}
			}catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.\n");
				sc.nextLine();
			}
		}
		sc.close();
	}
	
	public static void printMenu() {
		System.out.println("<메뉴>");
		System.out.println("1. 계산기");
		System.out.println("2. 구구단 출력");
		System.out.println("3. 종료");
		System.out.println();
	}
}

