package question02;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		System.out.println("exit을 입력하면 종료합니다.");
		Scanner sc=new Scanner(System.in);
		
		while (true) { //true : 무한반복
			System.out.print(">>");
			String a=sc.next();
			if (a.equals("exit")) { //equals : 문자열 비교 메소드
			break;
			}
		}
		System.out.println("종료합니다...");
		sc.close();
	}
}
