package chaper02;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		final double DOL=1200;
		final double EUR=1500;
		System.out.print("원화를 입력하세요(단위 원)>>");
		Scanner sc = new Scanner(System.in);
		int won = sc.nextInt();
		double dol = won/DOL;
		double eur = won/EUR;
		System.out.println(won+"원은 $"+dol+"입니다.");
		System.out.println(won+"원은 E"+eur+"입니다.");
		
		sc.close();
	}
}
