package chaper02;

import java.util.Scanner;

//class 여러개 사용해도 무관
class Aaa{}
class Baa{}
//public class : 자바파일 안에 두개이상 존재시 오류
//Jvm 이 수 많은 class 에서 public class 를 찾아감
public class testtest2 {
//	메소드 여러개 사용해도 무관
	public static void aaa() {}
	public static void bbb() {}
//	jvm이 수 많은 method 에서 main 메소드를 찾아감
		
	public static void main(String[] args) {
		System.out.println("2개의 실수 입력>>");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		System.out.println("두 수의 덧셈은"+ (a+b));
		System.out.println("두 수의 뺄셈은"+ (a-b));
		System.out.println("두 수의 곱셈은"+ (a*b));
		System.out.println("두 수의 나눗셈은"+ (a/b));
		
		sc.close();
	}
}
