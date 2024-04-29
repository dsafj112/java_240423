package chaper02;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		System.out.print("정수 3개를 입력하시오.");
		Scanner sc=new Scanner(System.in);
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	
		// or연산자를 사용해서 식 단축
		if ((a+b <= c)||(a+c <= b)||(b+c <= a)) {
			System.out.println("삼각형이 되지 않습니다.");
		} 
//		else if (a+c <= b) {
//			System.out.println("삼각형이 되지 않습니다.");
//		}
//		else if (b+c <= a) {
//			System.out.println("삼각형이 되지 않습니다.");
//		}
		else {
			System.out.println("삼각형이 됩니다.");
		}
		
		sc.close();
	}
}
