package view;

public class StarMakerView {

	public void starMenu() {
		System.out.println("별찍기 서비스입니다");
		System.out.println("원하는 도형을 선택하고 원하는 줄수를 입력하면 출력합니다.");
		System.out.println("원하는 도형을 선택해주세요.");
		System.out.println("1.직각삼각형");
		System.out.println("2.사각형");
		System.out.println("3.삼각형");
		System.out.println("4.역삼각형");
		System.out.println("5.마름모");
		System.out.println("6.별");
		System.out.println("==================================");
	}
	public void starselect() {
		System.out.println("를 선택하셨습니다");
	}
	public void viewStarMaker(starshape) {
		System.out.println("출력할 줄수를 선택해 주세요. 단 마름모와 별은 해당규칙준수");
	}
}
