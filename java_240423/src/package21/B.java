package package21;

public class B {
	public B() {
		A a=new A();
		a.field1=2;
		a.field2=2;
//		private 멤버는 자기클래스 안에서만 접근됨
//		a.field3=2;
		
		a.method1();
		a.method2();
//		private 멤버는 자기클래스 안에서만 접근됨
//		a.method3();
	}
}
