package question07;

import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n=sc.nextInt();
		int[] num=new int[n];
		int ran;
		
		for (int i = 0; i < num.length; i++) {
			ran=(int)(Math.random()*100+1);
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
//		
//		for (int i = 0; i < num.length/10+1; i++) {
//			System.out.println();
//		}
//		if (num.length < 10) {
//			for (int i = 1; i <= num.length%10; i++) {
//				ran=(int)(Math.random()*100+1);
//				num[i]=ran;
//				System.out.print(num[i]);
//		}
//		}else {
//			for (int i = 1; i <= 10; i++) {
//				ran=(int)(Math.random()*100+1);
//				num[i]=ran;
//				System.out.print(num[i]);
//			}
//		}
	}
}
