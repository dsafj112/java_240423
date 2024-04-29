package chaper02;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		System.out.print("3자리수 정수 입력(100~999)>>");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int hun=n/100;//100의 자리수
//		10자리수: 나누기 100의 나머지를 10으로 나눈 몫
		int ten=n%100/10;//10의 자리수
//		1의자리수: 나누기 100의 나머지를 10으로 나눈 나머지
		int one=n%100%10;//1의 자리수
		
		int x = (hun+ten);
		int y = (ten*one);
		
		System.out.println("100의 자리와 10의 자리의 합은"+x);
		System.out.println("10의 자리와 1의 자리의 곱은"+y);
		
		sc.close();
	}
}
