package question07;

import java.util.Iterator;
import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money=sc.nextInt();
		int[] unit= {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int res=0;
		
//		for (int i = 0; i < unit.length; i++) {
//			if (i==0) {
//				res=money/unit[i];
//				if (res!=0) {
//					System.out.println(unit[i]+"원 짜리 : "+res+"개");
//				} 
//			}else {
//				res=money%unit[i-1]/unit[i];
//				if (res!=0) {
//					System.out.println(unit[i]+"원 짜리 : "+res+"개");
//				} 
//			}
//		}
		
		for (int i = 0; i < unit.length; i++) {
			res = money/unit[i];
			if (res!=0) {
				System.out.println(unit[i]+"원 짜리 : "+res+"개");
			}
			if (res>0) {
				money=money%unit[i];
			}
		}
	}
}
