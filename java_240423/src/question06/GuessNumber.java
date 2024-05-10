package question06;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberToGuess=(int)(Math.random()*11);
		int guess;
		
//		while (true) {
//			System.out.print("추측한 숫자를 입력하세요: ");
//			guess=sc.nextInt();
//			if (guess!=numberToGuess) {
//				System.out.println("추측한 숫자가 틀렸습니다");
//			}
//			if (guess<numberToGuess) {
//				System.out.println("추측한 숫자가 너무 작습니다");
//			}
//			if (guess>numberToGuess) {
//				System.out.println("추측한 숫자가 너무 큽니다");
//			}
//			if (guess==numberToGuess) {
//				System.out.println("맞습니다");
//				break;
//			}
//		}

		System.out.print("추측한 숫자를 입력하세요: ");
		guess=sc.nextInt();

		while (guess!=numberToGuess) {
			System.out.print("추측한 숫자를 입력하세요: ");
			guess=sc.nextInt();
			System.out.println("추측한 숫자가 틀렸습니다");
			if (guess<numberToGuess) {
				System.out.println("추측한 숫자가 너무 작습니다");
			}
			else {
				System.out.println("추측한 숫자가 너무 큽니다");
			}
		}
		System.out.println("맞습니다");
		sc.close();
	}
}
