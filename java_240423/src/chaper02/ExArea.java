package chaper02;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		System.out.print("정수를 입력하시오");
		Scanner sc=new Scanner(System.in);
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
//마지막 숫자가 0이면 삼각형의 넓이 구함
		if (c == 0) {
			float triangle = (a*b)/2;
			System.out.println("삼각형의 넓이는 "+triangle+"입니다.");
		} else {
			float trapezoid = ((a+b)*c/2);
			System.out.println("사다리꼴의 넓이는 "+trapezoid+"입니다.");
		}
		//결과값이 실수로 나와야해서 float으로 형변환
//		if (c == 0) {
//			System.out.println("삼각형의 넓이는 "+(a*b/2)+"입니다.");
//		} else {
//			System.out.println("사다리꼴의 넓이는 "+(a+b)*c/2+"입니다.");
//		}
		
		
		sc.close();
	}
}
