package chaper02;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int max=0;
		int min=0;
		
		if (a>b&&a>c) {
			max=a;
		} 
		else if (b>a&&b>c) {
			max=b;
		} 
		else {
			max=c;
		} 
		if (c>a&&b>a) {
			min=a;
		} 
		else if (c>b&&a>b) {
			min=b;
		} 
		else {
			min=c;
		}
		
		System.out.println("최대값은 "+max);
		System.out.println("최소값은 "+min);
		sc.close();
	}
}
