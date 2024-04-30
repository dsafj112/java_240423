package question02;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("연산>> ");
		
		int a=sc.nextInt();
		String op=sc.next();
		int b=sc.nextInt();
		int res=0;
		
		if (op.equals("+")) {
			res = a + b;
		}else if (op.equals("-")) {
			res = a - b;
		}else if (op.equals("*")) {
			res = a * b;
		}else if (op.equals("^")) {
			res = (int) Math.pow(a, b);
		}else if (op.equals("/")) {
			if(b==0) {
				System.out.println("0으로는 나눌 수 없습니다.");
				sc.close();
				return;
			}else {
				res = a / b;
			}
		}else {
			System.out.println("사칙연산이 아닙니다.");
			sc.close();
			return;
		}
		
		System.out.println(a+op+b+"의 계산 결과는"+res);
		sc.close();
	}
}
