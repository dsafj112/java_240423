package question07;

import java.util.Scanner;

class Person{
	String lastName;
	String firstName;
	
	public void getFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void getLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getLenghth() {
		return lastName.length()+firstName.length();
	}
}
public class PersonDriver{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person person1 = new Person();
		Person person2 = new Person();

		System.out.print("성을 입력하세요:");
		String lname=sc.nextLine();
		person1.getLastName(lname);
		System.out.print("이름을 입력하세요:");
		String fname=sc.nextLine();
		person1.getFirstName(fname);
		
		System.out.print("성: "+person1.lastName
						+" 이름: "+person1.firstName
						+" 성명의 길이: "+person1.getLenghth());
		System.out.println();
		
		System.out.print("성을 입력하세요:");
		lname=sc.nextLine();
		person2.getLastName(lname);
		System.out.print("이름을 입력하세요:");
		fname=sc.nextLine();
		person2.getFirstName(fname);
		
		System.out.print("성: "+person2.lastName
						+" 이름: "+person2.firstName
						+" 성명의 길이: "+person2.getLenghth());
		
		sc.close();
	}
}
