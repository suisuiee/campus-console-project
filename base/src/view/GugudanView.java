package view;

import model.Gugudan;

public class GugudanView {
	public void GugudanView(Gugudan gugudan) {
		int num = gugudan.getNum();
		
		System.out.println(num + "단을 출력합니다.");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
}
