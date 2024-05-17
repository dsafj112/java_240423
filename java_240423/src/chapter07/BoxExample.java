package chapter07;

public class BoxExample {
	public static void main(String[] args) {
		Box box=new Box();
		Object box2=new Box();
		box.set("홍길동");
		//downcasting(String)
		String name = (String) box.get();
		System.out.println(name);
		
		box.set(777);
		//downcasting(int)
		int number = (int) box.get();
		System.out.println(number);
		
		box.set(new Apple());
		//downcasting(Apple)
		Apple apple = (Apple) box.get();
//		chapter07.Apple@515f550a
		System.out.println(apple);
	}
}
