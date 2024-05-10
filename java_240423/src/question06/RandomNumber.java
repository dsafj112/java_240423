package question06;

import java.util.Random;

/*
 * 난수를 발생 Math(클래스), Random(클래스)
 */
public class RandomNumber {
	public static void main(String[] args) {
		int rNumber;
		Random generator=new Random();
		
//		각 타입의 범위
//		generator.nextInt();//난수 발생(범위:int타임 범위-> -2의 31승~2의 31승-1)
//		generator.nextInt(10);//난수 발생(0~9의 정수)
//		generator.nextInt(10)+1;//난수 발생(1~10의 정수)
//		generator.nextInt(10)*()-1);//난수 발생(-9~0의 정수)
		
		while (true) {
			rNumber = generator.nextInt(10)+1;//난수 발생(1~10의 정수)
			System.out.println(rNumber);
			if (rNumber==7) {
				break;
			}
		}
		
//		while (true) {
//			rNumber = (int)(Math.random()*11);
//			System.out.println(rNumber);
//			if (rNumber==7) {
//				break;
//			}
//		}
	}
}
