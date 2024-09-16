
public class starmaker {

	public static void main(String[] args) {

		
	rightTriangle(10);
	square(9);
	Triangle(5);
	}


public static void rightTriangle(int n){
	System.out.println(n+"줄의 직각삼각형을 출력합니다.");
	for(int i=1; i<=n; i++) {
		for(int j=0; j<i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

public static void square(int n) {
	System.out.println(n+"줄의 사각형을 출력합니다.");
	for(int i=1; i<=n; i++) {
		for(int j=0; j<n; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void Triangle(int n) {
	System.out.println(n+"줄의 삼각형을 출력합니다");
	for(int  i=0; i<n; i++) {
		for(int j=0; j<n-1-i; j++) {
			System.out.print(" ");
		}
		for(int j=0; j<2*i+1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}