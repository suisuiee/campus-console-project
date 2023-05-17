package view;

import model.TimesTable;

public class TimesTableView {
	
	public void printTimesTable(TimesTable timesTable) {
		int num = timesTable.getNum();
		
		System.out.println(num + "단을 출력합니다.");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
}
