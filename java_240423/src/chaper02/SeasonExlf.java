package chaper02;

import java.util.Scanner;

public class SeasonExlf {
	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12)>>");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		String wth="";
		
		if (a >= 3 && a<=5)
			wth="봄";
		else if (a >= 6 && a<=8)
			wth="여름";
		else if (a >= 9 && a<=11)
			wth="가을";
		else if ((a==1)||(a==2)||(a==12)) {
			wth="겨울";
		}
//		if ((a==3)||(a==4)||(a==5)) {
//			wth="봄";
//		}
//		else if ((a==6)||(a==7)||(a==8)) {
//			wth="여름";
//		}
//		else if ((a==9)||(a==10)||(a==11)) {
//			wth="가을";
//		}
//		else if ((a==1)||(a==2)||(a==12)) {
//			wth="겨울";
//		}
		else {
			System.out.println("잘못입력");
		}
		
		System.out.println(wth);
		sc.close();
	}
}
