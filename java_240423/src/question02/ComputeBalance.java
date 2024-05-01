package question02;

import java.util.Scanner;

public class ComputeBalance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("구매 금액을 입력하세요: ");
		int pur = sc.nextInt();
		int bal=0;
		
		if (pur>=300000) {
			bal = pur - 30000;
		}
		else if (pur<300000&&pur>=100000) {
			bal = pur - 5000;
		}
		else {
			bal = pur;
		}
		
		System.out.println("구매금액 = "+pur);
		System.out.println("청구 금액 = "+bal);
		sc.close();
	}
}
