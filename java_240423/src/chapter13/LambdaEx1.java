package chapter13;

//람다식으로 구현할 한수형 인터페이스
interface MuFunction{
	int calc(int x, int y);//람다식으로 구현할 추상 메소드
}

public class LambdaEx1 {
	public static void main(String[] args) {
		MuFunction add=(x,y)->{return x+y;};//람다식
		MuFunction minus=(x,y)->x-y;//람다식 {}와 return 생략
		
		System.out.println(add.calc(1, 2));//합 구하기(람다식 객체에서 calc 메소드 호출)
		System.out.println(minus.calc(1, 2));//차 구하기(람다식 객체에서 calc 메소드 호출)
	}
}
