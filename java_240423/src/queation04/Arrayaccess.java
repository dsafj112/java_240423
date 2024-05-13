package queation04;

import java.util.Scanner;

public class Arrayaccess {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
		
		int[] n=new int[6];
		int res=0;
		
		for (int i = 1; i < n.length; i++) {
			n[i] = sc.nextInt();
			 if	(n[i]>=n[i-1]) {
				res=n[i];
			 }
		}
		
		System.out.println("가장 큰 수는 "+res+"입니다.");
		sc.close();
	}
}
