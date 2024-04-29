package chaper02;

import java.util.Scanner;

/*
 * 커피 주문을 받아서 커피명과 가격을 출력
 */

public class CoffeePrice {
	public static void main(String[] args) {
		System.out.print("무슨 커피를 드릴까요?");
		Scanner sc=new Scanner(System.in);
//		next : 문자열 입력받는 메소드
//		sc.next();
		String order = sc.next();
		int price=0;
		
		switch (order) {
		case "에스프레소": //3메뉴의 가격이 같음
		case "카푸치노":
		case "카페라떼":
			price=3500;
			break;
		
		case "아메리카노":
			price=2000;
			break;
			
//		생략가능
//		default:
//			break;
		default:
			System.out.println("메뉴에 없습니다!");
			break;
		}
		if (price != 0) {
			System.out.println(order+"는 "+price+"원 입니다.");
		}
		sc.close();
	}
}
