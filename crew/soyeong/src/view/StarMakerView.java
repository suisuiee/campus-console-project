package view;

import model.StarMaker;

public class StarMakerView {

	public void printStarMakerView(StarMaker starmaker) {
		int num = starmaker.getNum();

		if (num == 1) { // 직각삼각형
			for (int i = 0; i < 6; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (num == 2) { // 역직각삼각형
			for (int i = 5; i >= 0; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (num == 3) { // 정삼각형
			for (int i = 1; i < 6; i++) {
				for (int j = 0; j < 5 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (2 * i) - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (num == 4) { // 역정삼각형
			for (int i = 5; i > 0; i --) {
				for (int j = 0; j < 6-i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j<(2*i)-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (num == 5) { // 사각형
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 7; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		} else if (num == 6) { // 마름모
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (2 * i) - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = 5; i > 0; i --) {
				for (int j = 0; j < 5-i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j<(2*i)-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else { // 이외의 번호 입력 시
			System.out.println("번호를 다시 입력해주세요");
		}
	}
}