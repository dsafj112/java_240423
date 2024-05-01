package question02;

import java.util.Scanner;

public class ArithmeticExSwitch {
	public static void main(String[] args) {
		System.out.print("연산>>");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();
		int res = 0;
		
		switch (op) {
		case "+":
			res = a + b;
			break;
		case "-":
			res = a - b;
			break;
		case "*":
			res = a * b;
			break;
		case "/":
			if(b==0) {
				System.out.println("0으로는 나눌 수 없습니다.");
				sc.close();
				return;
			}else {
				res = a / b;}
			break;

		default:
			System.out.println("사칙연산이 아닙니다.");
			sc.close();
			return;
//			break; // 브레이크 대신 리턴 사용
		}
		
		System.out.println(a+op+b+"의 계산 결과는"+res);
		sc.close();
	}
}
