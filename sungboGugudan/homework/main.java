package homework;
import controller.gugudanControl;
import controller.calculatorController;
import view.gugudanView;
import view.calculatorView;
import model.gugudanModel;
import model.calculatorModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		boolean systemState = true;
		while(systemState) {
			System.out.println("구구단 계산기 입니다 구구단은 g 계산기는 c 종료는q입니다 ");
			input = br.readLine();
			if(input.equals("q")) {
				break;
			}
			if(input.equals("g")) {
				System.out.println("구구단 서비스로 이동합니다...");
				gugudanView gugudanview = new gugudanView();
				gugudanControl gugudancontrol = new gugudanControl();
				gugudanview.gugudanView1();
				gugudancontrol.gugudanControl1();
				break;
			}
			if(input.equals("c")) {
				System.out.println("계산기 서비스로 이동합니다...");
     			calculatorModel calcmodel = new calculatorModel();
				calculatorView calcview = new calculatorView();
				calculatorController calccontrol = new calculatorController(calcmodel, calcview);				
				calcview.calculatorMenu();
				calccontrol.calculate();
				break;
			}
			else {
				System.out.println("잘못된 입력입니다");
			}
		}
		System.out.println("서비스가 끝났습니다 종료합니다.");
	}

}
