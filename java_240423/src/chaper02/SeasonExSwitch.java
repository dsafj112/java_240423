package chaper02;

import java.util.Scanner;

public class SeasonExSwitch {
	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12)>>");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String wth;
		
		switch (a) {
		case 3,4,5:
			wth="봄";
			break;
		case 6,7,8:
			wth="여름";
		break;
		case 9,10,11:
			wth="가을";
		break;
		case 12,1,2:
			wth="겨울";
		break;

		default:wth="";
			System.out.println("잘못입력");
			break;
		}
		
		System.out.println(wth);
		sc.close();
	}
}
