package chapter05_2;

//기본폰, 전화를 걸어서 100초 동안 응답 없으면 타임아웃
interface PhoneInterface{
//	public static final int timeout=100;
	int timeout=100;//public static final 생략
//	public abstract void sendCall();//추상메소드
	void sendCall();//public abstract 생략
	void receiveCall();//public abstract 생략
	default void printLogo() {//default(일반메소드)는 구현해야함
		System.out.println("** Phone **");
	}
}

//삼성폰을 만들때 기본폰 기능을 사용(전화 걸고, 받는 것)
class SamsungPhone implements PhoneInterface {
	//추상메소드 오버라이딩 2개
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
//	삼성폰 고유의 기능
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone=new SamsungPhone();
		phone.printLogo();//인터페이스 상속받아서 사용
		phone.sendCall();//추상메소드 구현해서 사용
		phone.receiveCall();//추상메소드 구현해서 사용
		phone.flash();//삼성폰 고유의 기능
	}
}
