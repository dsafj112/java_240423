package chaper02;

public class Ramyun {
	public static void main(String[] args) {
//		순서는 여기서 정하면 됨
		buy();
		boil();
		put();
		eat();
	}
	
	public static void boil() {
		System.out.println("물을 끊인다.");
	}
	
	public static void buy() {
		System.out.println("라면을 사온다.");
	}
	
	public static void eat() {
		System.out.println("맛있게 먹는다.");
	}
	
	public static void put() {
		System.out.println("라면을 넣는다.");
	}
}
