package controller;

import java.util.Scanner;

import model.StarMaker;
import view.StarMakerView;

public class StarMakerController {

	private Scanner sc = new Scanner(System.in);
	private int num;

	public StarMakerController() {
	}

	public void start() {
		while (true) {
			System.out.print("\n그릴 별 모양 선택\n1.삼각형\n2.역삼각형\n3.트리\n4.역트리\n5.사각형\n6.마름모\n(0 입력 시 별 찍기 종료) > ");
			num = sc.nextInt();
			System.out.println();
			if (num == 0) {
				System.out.println();
				break;
			}
			
			StarMaker starMaker = new StarMaker(num);
			StarMakerView smv = new StarMakerView();
			smv.printStarMakerView(starMaker);
		}
	}

}
