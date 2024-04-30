package chaper02;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int median=0;
		
		if ((a>b && a<c)||(a>c && a<b)) {
			System.out.println("중간 값은 "+a);
		} 
		else if ((b>a && b<c)||(b>c && b<a)) {
			System.out.println("중간 값은 "+b);
		} 
		else {
			System.out.println("중간 값은 "+c);
		}
	}
	
}
