package question02;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("10~99 사이의 정수를 입력하시오>>");
		int n = sc.nextInt();
		
		if ((n/10==3||n/10==6||n/10==9)&&(n%10==3||n%10==6||n%10==9)) {
			System.out.println("박수짝짝");
		}
		else if ((n/10==3||n/10==6||n/10==9)||(n%10==3||n%10==6||n%10==9)) {
			System.out.println("박수짝");
		}
		
		sc.close();
		
		
//		count : 3,6,9 갯수
//		num : 입력받는 정수
//		a : 10의자리
//		b : 1의자리
		
//		int count=0, num, a, b;
//		num = sc.nextInt();
//		a = num/10;
//		b = num%10;
		
//		3,6,9 일때
//		if (a%3==0) {
//			count++; //카운트 증가
//		}
//		3,6,9 일때
//		if (a%3==0 && b != 0) {
//			count++; //카운트 증가
//		}
		
//		if (count==2) {
//			System.out.println("박수짝짝");
//		} else if(count==1){
//			System.out.println("박수짝");
//		}
	}
}
