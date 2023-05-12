package model;

public class StarMakerModel {

	public static void main(String[] args) {

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
public static void invertedTriangle(int n) {
	System.out.println(n+"줄의 역삼각형을 출력합니다.");
	for(int i=0; i<n; i++) {
		for(int j=0; j<i; j++) {
			System.out.print(" ");
		}
		for(int j=0; j<2*n-1-2*i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void diamond(int n) {
	System.out.println(n+"줄의 마름모를 출력합니다.");
	for (int i=0;i<n;i++){
		  for (int j=0; j<n;j++)
		  {
		     if (i<=n/2)
		     {
		        if (i+j<=n/2-1)
		           System.out.print(" ");
		        else if (j-i>=n/2+1) 
		        	System.out.print(" ");
		        else
		           System.out.print("*");
		     }
		     else if (i>n/2)
		     {
		        if (i-j>=n/2+1) 
		        	System.out.print(" ");
		        else if (i+j>=n/2*3+1)
		        	System.out.print(" ");
		        else
		        	System.out.print("*");
		     }
		  }
		  System.out.println();
		}
}
}