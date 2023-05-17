package model;

public class StarMaker {
    // StarMaker Model
	private int starNum1;
	private int starNum2;

	public StarMaker(){}

	public void StarMaker1() {
		switch (starNum1) {
			case 1:
				rightTriangle(starNum2);
				break;
			case 2:
				square(starNum2);
				break;
			case 3:
				Triangle(starNum2);
				break;
			case 4:
				invertedTriangle(starNum2);
				break;
			case 5:
				diamond(starNum2);
				break;
			case 6:
				Star(starNum2/2);
				break;
			default:
				System.out.println("1~6까지의 숫자만 입력 가능합니다.");
				break;
		}
	}

	public static void rightTriangle(int n) {
		System.out.println(n + "줄의 직각삼각형을 출력합니다.");
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void square(int n) {
		System.out.println(n + "줄의 사각형을 출력합니다.");
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void Triangle(int n) {
		System.out.println(n + "줄의 삼각형을 출력합니다");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void invertedTriangle(int n) {
		System.out.println(n + "줄의 역삼각형을 출력합니다.");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * n - 1 - 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void diamond(int n) {
		System.out.println(n + "줄의 마름모를 출력합니다.");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= n / 2) {
					if (i + j <= n / 2 - 1)
						System.out.print(" ");
					else if (j - i >= n / 2 + 1)
						System.out.print(" ");
					else
						System.out.print("*");
				} else if (i > n / 2) {
					if (i - j >= n / 2 + 1)
						System.out.print(" ");
					else if (i + j >= n / 2 * 3 + 1)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void Star(int n) {
		System.out.println(n*2+"줄의 별을 출력합니다");
		int i;
		int j;
		for (i = 0; i < n; i += 2) {
            //입력한 수만큼 오른쪽으로 삼각형 땡겨줌
            for (int a = 0; a < n; a++) {
                System.out.print("  ");
            }
            //나머지는 마름모할때 윗부분삼각형과 동일함
            for (j = n; j >= i; j -= 2) {
                System.out.print("  ");
            }
            for (int star = 0; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int count = n * 3; //중단의 최대길이

        for (i = 0; i < n / 2 + 1; i++) { //높이를 입력한 크기의 2분의1정도로 하여 균형을 맞춤
            System.out.print("  ");   //줄맞춤용
            for (j = 0; j < i; j++) { // i의 크기만큼 공백을 줘서 별이 찍힐 시작점을 맞춤(i는 1씩 증가하니깐 공백도 1씩 증가
                System.out.print("  ");
            }
            for (int k = 0; k < n * 3; k++) { //입력한 크기의 3배만큼 별을 찍어야함
                if (k < count) {    //단, count라는 개수보다 적을때만 별을 찍음(count는 별의 개수를 나타내는 변수임, 2개씩 줄어들게 해놨음)
                    System.out.print("* ");
                }
            }
            //몸통 한줄 더 키울려고 추가함
            if(i == n/2){
                System.out.println();
                System.out.print("  ");   //줄맞춤용
                for (j = 0; j < i; j++) { // i의 크기만큼 공백을 줘서 별이 찍힐 시작점을 맞춤(i는 1씩 증가하니깐 공백도 1씩 증가
                    System.out.print("  ");
                }
                for (int k = 0; k < n * 3; k++) { //입력한 크기의 3배만큼 별을 찍어야함
                    if (k < count) {    //단, count라는 개수보다 적을때만 별을 찍음(count는 별의 개수를 나타내는 변수임, 2개씩 줄어들게 해놨음)
                        System.out.print("* ");
                    }

                }
            }
            count -= 2; //다음에 찍힐 별을 2개줄임
            System.out.println();
        }
        count = n;//왼쪽밑둥용(중단에서 사용한거 재활용)
        int count2 = 0;//오른쪽밑둥용
        for (i = 0; i < n/2+1; i++) {   //하단줄의 개수를 밑변개수의 절반만큼으로함
            System.out.print("  ");
            for (j = i; j < n / 2; j++) {   //절반만큼의 공백을 띄움
                System.out.print("  ");
            }
            //별(왼쪽밑)
            for (int k = 0; k < n; k++) { //입력개수만큼 별찍기를하는데 k가 count보다 작을때만 별을 찍음
                if (k < count) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  "); //정가운데 공백
            //count2를 이용해 오른쪽밑둥을 오른쪽을 떙겨줌
            for (j = 0; j < count2; j++) {
                System.out.print("  ");
            }
            //별(오른쪽밑)
            for (int k = 0; k < n; k++) {
                if (k < count) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            count -= 2;
            count2 += 4;
            System.out.println();
        }
	}
	public int getStarNum1() {
		return starNum1;
	}

	public void setStarNum1(int starNum1) {
		this.starNum1 = starNum1;
	}

	public int getStarNum2() {
		return starNum2;
	}

	public void setStarNum2(int starNum2) {
		this.starNum2 = starNum2;
	}
}
