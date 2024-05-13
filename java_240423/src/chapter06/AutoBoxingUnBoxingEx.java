package chapter06;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n=10;
		String x="123";
//		n을 값으로 가지는 객체 생성(intObject: 참조변수)
		Integer intObject = Integer.valueOf(n);//정수 boxing
		Integer intObject2 = n;//auto boxing
		Integer intObject3 = Integer.valueOf(x);//문자열 boxing
//		Integer intObject4 = x;//오류
		
		//10 출력
		System.out.println("intObject = "+intObject);
		System.out.println("intObject = "+intObject);
		System.out.println("intObject2 = "+intObject2);
		System.out.println(intObject3);
		
//		int m = intObject.intValue() + intObject.intValue();//unboxing
		int m = intObject + intObject;//auto unboxing
		System.out.println("m = "+m);//m = 20
	}
}
