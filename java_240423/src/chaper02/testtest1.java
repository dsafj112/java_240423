package chaper02;

import java.util.Scanner;

public class testtest1 {

	public static void main(String[] args) {
		System.out.println("2개의 정수 입력>>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("두수의 합은 "+ (a+b));
		System.out.println("두수의 곱은 "+ (a*b));
		
		sc.close();
	}

}
