package question06;

import java.util.Scanner;

public class MultibleOfThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오>>");
		int[] num=new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
			if (i==0) {
				System.out.print("3의 배수는 ");
			}
			if (num[i]%3==0) {
				System.out.print(num[i]+" ");
			}
			sc.close();
		}
	}
}
