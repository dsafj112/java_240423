package question07;

import java.util.Scanner;

//사다리꼴 면적=(윗변+아랫변)*높이/2
public class Trapezoid {
	int down;
	int up;
	int height;
	
//	public Trapezoid(int down, int up, int height) {
//		this.down = down;
//		this.up = up;
//		this.height = height;
//	}
	//계산 메소드
	public double getArea() {
		return (down+up)*height/2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(">> ");
		
//		int down=sc.nextInt();
//		int up=sc.nextInt();
//		int height=sc.nextInt();
//		Trapezoid num=new Trapezoid(down, up, height);
		
		Trapezoid num=new Trapezoid();
		num.down=sc.nextInt();
		num.up=sc.nextInt();
		num.height=sc.nextInt();
		
		System.out.println("사다리꼴의 면적은 "+num.getArea());
		sc.close();
	}
}
