package queation04;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
//		상수로 100달러 원화 계산
//		final int hun=120000;
//		final int ten=12000;
		Scanner sc=new Scanner(System.in);
		System.out.print("가구수를 입력하시오>>");
		int num=sc.nextInt();
		int rate=1200;
		int money=0;
//		int res;
		
//		if (num==1) {
//			money=400000;
//		}else if (num==2) {
//			money=600000;
//		}else if (num==3) {
//			money=800000;
//		}else if (num>=4) {
//			money=1000000;
//		}
//		res = money/hun;
		
//		if (res>0) {
//			System.out.println("100달러짜리 "+res+"매");
//		}
//		money = money%hun;
//		res = money/ten;
		
//		if (res>0) {
//			System.out.println("10달러짜리 "+res+"매");
//		}
		
		
		if (num==1) {
			money=400000/rate;
		}else if (num==2) {
			money=600000/rate;
		}else if (num==3) {
			money=800000/rate;
		}else if (num>=4) {
			money=1000000/rate;
		}
		
		int a=money/100;
		int b=money%100/10;
		
		if (a>0) {
			System.out.println("100달러짜리 "+a+"매");
		}
		if (b>0) {
			System.out.println("10달러짜리 "+b+"매");
		}
		sc.close();
	}
}
