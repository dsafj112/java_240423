package queation04;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int n=sc.nextInt();
		
//		for (int i = 0; i < n; i++) {
//		감소시키는 로직을 위해서 역으로 진행
		for (int i = n; i > 0; i--) {
//			하나씩 줄이기 위해서 i값 사용
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
