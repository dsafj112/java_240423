package chaper02;

import java.util.Scanner;

public class testtest3 {
	public static void main(String[] args) {
//		int rate=1100;
//		환율 고정할때 상수 사용(관습적으로 대문자)
		final double RATE=1100;
		Scanner sc=new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원)>>");
		int won = sc.nextInt();
//		int dollar = won / RATE;
		double dollar = won / RATE;
		System.out.println(won+"원은 $"+dollar+"입니다.");
		
		sc.close();
	}
}
