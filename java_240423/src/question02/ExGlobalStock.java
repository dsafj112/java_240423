package question02;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("매수금액을 입력하세요: ");
		int a=sc.nextInt();
		System.out.print("매도금액을 입력하세요: ");
		int b=sc.nextInt();
		double tax=0;
		
		if (a>=b) {
			tax = 0;
		} else {
			tax = (b-a) * 0.22;
		}
		
		System.out.println("양도세 = "+tax);
		sc.close();
	}
}
