package question07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String a=sc.nextLine();
			list.add(a);
		}
		
		String longest="";
		
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			System.out.print(name+" ");
			if (i == 0) {
				longest=name;
			}
			else if (list.get(i-1).length() < list.get(i).length()) {
				longest=name;
			}
		}
		System.out.println();
		System.out.println("가장 긴 이름은 : "+longest);
		sc.close();
	}
}