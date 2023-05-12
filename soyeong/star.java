import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		while (true) {
			System.out.print("그릴 별 모양 선택\n1.삼각형 2.역삼각형 3.트리 4.역트리 5.사각형 6.마름모> ");
			input = sc.nextInt();
			System.out.println();

			if (input == 1) { // 삼각형
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				System.out.println();
			} else if (input == 2) { // 역삼각형
				for (int i = 5; i >= 0; i--) {
					for (int j = 0; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				System.out.println();
			} else if (input == 3) { // 트리
				for (int i = 0; i < 10; i += 2) {
					for (int j = 9; j > i; j -= 2) {
						System.out.print(" ");
					}
					for (int j = 1; j < i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			} else if (input == 4) { // 역트리
				for (int i = 0; i < 10; i += 2) {
					for (int j = 0; j < i; j += 2) {
						System.out.print(" ");
					}
					for (int j = 9; j > i; j--) {
						System.out.print("*");
					}
					System.out.println();
				}
			} else if (input == 5) { // 사각형
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 6; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				System.out.println();

			} else if (input == 6) { // 마름모

			} else { // 이외의 번호 입력시 종료
				sc.close();
				break;
			}
			System.out.println();
		}
	}
}
