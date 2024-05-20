package question07;

import java.util.Scanner;

public class RandomArray2 {
//	난수의 중복을 체크하는 메소드
//	a[]: array, to: 0, r: 23
	public static boolean exists(int a[], int to, int r) {
		//0: 반복안함
		for (int i = 0; i < to; i++) {
//			a[0]:23, r:33
			if (a[i] == r) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n=sc.nextInt();
		int[] num=new int[n];
		int ran;
		
		for (int i = 0; i < num.length; i++) {
			ran=(int)(Math.random()*100+1);
//			i=0, r=23,, i=1, r=33
			if (exists(num, i, ran)) {
				i--;
				continue;
			}
//			num[0]=23
//			num[1]=33
			num[i] = ran;
			if (i == 0) {
				System.out.print(num[i]+" ");
			} else {
				if (i%10 == 0) {
					System.out.println();
				}
				System.out.print(num[i]+" ");
			}
		}
	
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("정수 몇개?");
//		int n=sc.nextInt();
//		int[] num=new int[n];
//		int ran;
//		
//		for (int i = 0; i < num.length; i++) {
//			ran=(int)(Math.random()*100+1);
//			num[i] = ran;
//			for (int j = 0; j < i; j++) {
//				if (num[j]==num[i]) {
//					i--;
//				}
//			}
//		}
//		for (int i = 0; i < num.length; i++) {
//			if (i == 0) {
//				System.out.print(num[i]+" ");
//			} else {
//				if (i%10 == 0) {
//					System.out.println();
//				}
//				System.out.print(num[i]+" ");
//			}
//		}
		sc.close();
	}
}
