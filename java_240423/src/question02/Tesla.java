package question02;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오>>");
		int num=sc.nextInt();
		int tesla=520;
		int a=num*tesla/100;
		int b=num*tesla%100/10;
		
		if (a>0) {
			System.out.println("100달러짜리 "+a+"매");
		}
		if (b>0) {
			System.out.println("10달러짜리 "+b+"매");
		}
		sc.close();
	}
}
