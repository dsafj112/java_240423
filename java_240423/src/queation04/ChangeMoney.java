package queation04;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money=sc.nextInt();
		int fifthou=money/50000;
		int tenthou=money%50000/10000;
		int thou=money%10000/1000;
		int five=money%1000/500;
		int hun=money%500/100;
		int fif=money%100/50;
		int ten=money%50/10;
		int one=money%10;
		
		if (fifthou>0) {
			System.out.println("오만원권"+fifthou+"매");
		}
		if (tenthou>0) {
			System.out.println("만원권"+tenthou+"매");
		}
		if (thou>0) {
			System.out.println("천원권"+thou+"매");
		}
		if (five>0) {
			System.out.println("오백권"+five+"매");
		}
		if (hun>0) {
			System.out.println("백원권"+hun+"매");
		}
		if (fif>0) {
			System.out.println("오십원권"+fif+"매");
		}
		if (ten>0) {
			System.out.println("십원권"+ten+"매");
		}
		System.out.println("일원권"+one+"매");
		sc.close();
		
		
		
//		final int 오만원=50000;
//		final int 만원=10000;
//		final int 천원=1000;
//		final int 오백원=500;
//		final int 백원=100;
//		final int 오십원=50;
//		final int 십원=10;
//		final int 일원=1;
//		int res, money;
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("금액을 입력하시오>>");
//		money=sc.nextInt();
//		
//		res = money/오만원;
//		if (res>0) {
//			System.out.println("오만원권"+res+"매");
//		}
//		
//		money = money%오만원;
//		res = money/만원;
//		if (res>0) {
//			System.out.println("만원권"+res+"매");
//		}
//		money = money%만원;
//		res = money/천원;
//		if (res>0) {
//			System.out.println("천원권"+res+"매");
//		}
//		money = money%천원;
//		res = money/오백원;
//		if (res>0) {
//			System.out.println("오백원권"+res+"매");
//		}
//		money = money%오백원;
//		res = money/백원;
//		if (res>0) {
//			System.out.println("백원권"+res+"매");
//		}
//		money = money%백원;
//		res = money/오십원;
//		if (res>0) {
//			System.out.println("오십원권"+res+"매");
//		}
//		money = money%오십원;
//		res = money/십원;
//		if (res>0) {
//			System.out.println("십원권"+res+"매");
//		}
//		money = money%십원;
//		res = money/일원;
//		if (res>0) {
//			System.out.println("일원권"+res+"매");
//		}
//		
	}
}
