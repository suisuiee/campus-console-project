package model;

public class TimesTable {
	private int num;

	public TimesTable(int num) {
		this.num = num;
	}

	public void printTimesTable() {
		System.out.println(num + "단을 출력합니다.");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
