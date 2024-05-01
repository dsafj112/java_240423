package question02;

import java.util.Scanner;

public class CalculateGrade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("부정행위 여부: ");
		boolean cht=sc.nextBoolean();
		System.out.print("출석률: ");
		int att=sc.nextInt();
		System.out.print("총점: ");
		int tot=sc.nextInt();
		char grade;
		
		if (att<80) {
			grade='F';
		} else if (cht!=(true)) {
			if (tot>=90) {
				grade='A';
			} else if (tot>=80) {
				grade='B';
			} else if (tot>=70) {
				grade='C';
			} else if (tot>=60) {
				grade='D';
			} else {
				grade='F';
			}
		} else {
			grade='F';
		}
		
//		System.out.println();
//		System.out.println("부정행위 여부: "+cht);
//		System.out.println("출석률: "+att);
//		System.out.println("총점: "+tot);
		System.out.println("학점: "+grade);
		sc.close();
	}
}
