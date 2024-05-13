package question07;

import java.util.Scanner;

public class Computelnterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double principal;//원금
		double rate;//연이율
		double balance;//원리금
		int years=0;
		
		System.out.print("원금을 입력하세요");
		double scan=sc.nextDouble();
		principal=scan;

		System.out.print("연이율을 입력하세요");
		scan=sc.nextDouble();
		rate=scan;
		balance=principal;
		System.out.println("연도수\t원리금");
		
		while(balance<=(principal*2)) {
			years+=1;
			balance=balance*(1.0 + rate / 100.0);
			System.out.println(years+" \t"+balance);
		}
		System.out.println("\n필요한 연도수 = "+years);
		sc.close();
	}
}
