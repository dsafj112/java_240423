package chaper02;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
	System.out.print("점(x,y)의 좌표를 입력하시오>>");
	Scanner sc=new Scanner(System.in);
	
	int x=sc.nextInt();
	int y=sc.nextInt();
	
//	(100, 100),(200,200) 죄표 범위
	if (((x<=200)&&(x>=100))&&((y<=200)&&(y>=100))) {
		System.out.println("("+x+", "+y+")는 사각형 안에 있습니다.");
	}
	else {
		System.out.println("("+x+", "+y+")는 사각형 안에 있지 않습니다.");
	}
	sc.close();
}
}
