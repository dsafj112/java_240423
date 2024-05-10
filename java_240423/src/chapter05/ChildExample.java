package chapter05;

public class ChildExample {
	public static void main(String[] args) {
//		Parent 클래스에 기본생성자 만들어서 호출하고,
//		Child 클래스에 기본생성자 만들어서 호출
		//upcasting(super class 타입으로 sub calss 객체 생성)
		Parent parent = new Child();
		parent.field1="data1";
//		upcasting 된 객체는 서브클래스 멤버 접근 불가
//		parent.field2="data1";//오류
		parent.method1();
		parent.method2();
//		upcasting 된 객체는 서브클래스 멤버 접근 불가
//		parent.method3();//오류
		
		Child child = (Child) parent;//down cadting
//		parent = (Child) parent;//down cadting//오류
//		down castinf 객체는 서브 클래스 멤버 접근 가능
		child.filed2="yyy";
//		down castinf 객체는 서브 클래스 멤버 접근 가능
		child.method3();
//		(Child)parent.method3();//안됨
//		parent.method3();//못함
	}
}
