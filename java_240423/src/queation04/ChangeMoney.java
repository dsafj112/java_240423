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
	}
}
