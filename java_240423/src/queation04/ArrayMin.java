package queation04;

import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
//		2. 두번째 방법
		int res = Integer.MAX_VALUE;//int 타입의 가장 큰 숫자
//		int res=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("양수 7개를 입력하세요.");
		int[] num=new int[7];
		
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
//			1.첫번째 방법
//			첫번째 반복 할때 무조건 배열원소를 res에 저장
//			if (i==0) {
//				res=num[i];
//			}
			if (num[i]<res) {
				res=num[i];
			}
		}
		System.out.println("가장 작은 수는 "+res+"입니다.");
		sc.close();
	}
}
