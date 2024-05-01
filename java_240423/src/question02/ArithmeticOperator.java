package question02;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int i = sc.nextInt();
		int sec = i;
		int min = 0;
		int hour = 0;
		
		min = sec/60;
		sec = sec%60;
		hour = min/60;
		min = min%60;
		
		System.out.println(i+"초는 "+hour+"시간, "+min+"분, "+sec+"초입니다.");
		sc.close();
	}
}
