package question02;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요.");
		int sum=0;
		int i=0;
		
		for (int j = 0; j < 5; j++) {
			i = sc.nextInt();
			if (i<=0) {
				continue;
			} else {
				sum += i;
			}
			}
	//		if (i>0) {
	//			sum += i;
	//		}
		
		System.out.println("양수의 합은 "+sum);
		sc.close();
	}
}
