package chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//List 컬렉션에서  ArrayList 클래스로 객체 생성(제네릭 타입 파라미터 String)
		//upcasting
		List<String> list = new ArrayList<>();//List에 커서 위치하고 ctrl+t
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");//2번 인덱스에 삽입되어서 2번이 밀려남=>3: Servalet/JSP
		list.add("Spring");
		
		int size = list.size();
		System.out.println("총 list 갯수: "+size);//총 list갯수: 5
		
		String skill = list.get(2);
		System.out.println("2번째 인덱스: "+skill);//2번째 인덱스: Database
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			/*
			   0: Java
			   1: JDBC
			   2: Database
			   3: Servlet/JSP
			   4: Spring
			 */
			System.out.println(i+": "+str);
		}
		
		System.out.println();
		list.remove(2);//인덱스로 객체를 삭제
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
		
		System.out.println();
		list.remove("Spring");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
	}
}
