package view;
import java.util.Scanner;

public class StarMakerView {
    public void starMarkerViewTest(){
        System.out.println("StarMakerView.starMarkerViewTest");
    }
	private Scanner scanner = new Scanner(System.in);
	public void starMenu() {
		System.out.println("별찍기 서비스입니다");
		System.out.println("원하는 도형을 선택하고 원하는 줄수를 입력하면 출력합니다.");
		System.out.println("1.직각삼각형");
		System.out.println("2.사각형");
		System.out.println("3.삼각형");
		System.out.println("4.역삼각형");
		System.out.println("5.마름모");
		System.out.println("6.별");
		System.out.println("==================================");
	}
	public int getInputNumber() {
		System.out.println("숫자를 입력하세요 단, 마름모는 홀수, 별은 짝수의줄만 출력가능");
		return scanner.nextInt();
	}
}
