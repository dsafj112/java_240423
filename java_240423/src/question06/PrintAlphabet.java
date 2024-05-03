package question06;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
//		char alpha=sc.next().charAt(0);
		String a=sc.next();
		char alpha=a.charAt(0);
		
		for (char i = alpha; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
			sc.close();
		}
	}
}
