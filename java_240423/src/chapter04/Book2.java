package chapter04;

import java.util.Scanner;

public class Book2 {
	Scanner sc= new Scanner(System.in);
	String title;
	String author;
	
	public Book2(String title, String author) {
		String a = sc.next();
		String b = sc.next();
		System.out.println("테스트 "+a+" "+b);
//		매개변수를 this 자지자신의 객체 멤버로 저장
		this.title=title;
		this.author=author;
	}
	
	public Book2(String title) {
		this(title,"작자미상");//첫번째 라인에 안오면 오류 발생
		System.out.println("생성자2 호출됨");
	}
	void show() {
		System.out.println(title+" "+author);
	}
	
	public Book2() {
		this("","");//첫번째 라인에 안오면 오류 발생
		System.out.println("생성자3 호출됨");
	}
	
	public static void main(String[] args) {
//		Book2 littlePrince =  new Book2("어린왕자", "생텍쥐베리");
//		Book2 loveStory =  new Book2("춘향전");
		Book2 empty =  new Book2("","");
		
//		System.out.println(littlePrince.title+" "+littlePrince.author);
//		littlePrince.show();
//		loveStory.show();
		empty.show();
	}
}
