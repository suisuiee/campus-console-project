package view;

import model.Gugudan;

public class GugudanView {
	public void gugudanViewTest() {
		System.out.println("GugudanView.gugudanViewTest");
	}
	/**
     * 계산 결과 출력
     * @param gugudan
     */
	public void printResult(Gugudan gugudan) {
		int num = gugudan.getNum();
		
		System.out.println("----------------------");
		System.out.println(num + "단을 출력합니다.");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		System.out.println("----------------------");
	}
}