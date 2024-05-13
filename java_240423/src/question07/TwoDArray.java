package question07;

import java.util.Random;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] num=new int[4][4];
		Random randomn=new Random();
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j]=randomn.nextInt(10)+1;
//				num[i][j]=(int)(Math.random()*10+1);
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
