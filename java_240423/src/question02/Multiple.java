package question02;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		int num=sc.nextInt();
		boolean mul=(false);
		
		if (num%3==0) {
			System.out.println("3의 배수이다");
			mul=(true);
		}
		if (num%5==0) {
			System.out.println("5의 배수이다");
			mul=(true);
		}
		if (num%8==0) {
			System.out.println("8의 배수이다");
			mul=(true);
		}
		if (mul==false)
		System.out.println("어느 배수도 아니다");
		
//		if (num%3==0||num%5==0||num%8==0) {
//			mul=(true);
//			if (num%3==0) {
//				System.out.println("3의 배수이다");
//			}
//			if (num%5==0) {
//				System.out.println("5의 배수이다");
//			}
//			if (num%8==0) {
//				System.out.println("8의 배수이다");
//			}
//		}
//		else {
//			System.out.println("어느 배수도 아니다");
//		}
		sc.close();
	}
}
