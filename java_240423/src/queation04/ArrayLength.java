package queation04;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("5개의 정수를 입력하세요>>");
		int[] num=new int[5];
		double sum=0;
		
		for (int i = 0; i < num.length; i++) {
//			5번 반복해서 배열원소에 정수를 저장
			num[i]=sc.nextInt();
			sum += num[i];
		}
//		double res=sum/num.length;
//		System.out.println("평균은 "+res);
		System.out.println("평균은 "+sum/num.length);
		sc.close();
	}	
}
