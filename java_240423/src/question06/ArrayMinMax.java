package question06;

import java.util.Scanner;

import chaper02.IntergerLoteralExamlpe;

public class ArrayMinMax {
	public static void main(String[] args) {
		System.out.println("양수 10개를 입력하세요.");
		Scanner sc=new Scanner(System.in);
//		int min=Integer.MAX_VALUE;
//		int max=Integer.MIN_VALUE;
		int[] n=new int[10];
		int min=0;
		int max=0;
		
		for (int i = 0; i < n.length; i++) {
			n[i]=sc.nextInt();
				if (i==0) {
					min=n[i];
					max=n[i];
				}
				if (min>n[i]) {
					min=n[i];
				}
				if (max<n[i]) {
					max=n[i];
				}
		}
		System.out.println("가장 작은 수는 "+min+"이고,가장 큰 수는 "+max+"이고,");
		System.out.println("최소값+최대값은 "+(min+max)+"입니다.");
		sc.close();
	}
}
