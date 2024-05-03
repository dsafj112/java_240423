package question05;

public class IrregularArray {
	public static void main(String[] args) {
		int[][] num=new int[5][];
		num[0]=new int[5];
		num[1]=new int[1];
		num[2]=new int[4];
		num[3]=new int[2];
		num[4]=new int[3];
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j]=(i+3)*10+j+5;
				System.out.print(num[i][j]+" ");
			}System.out.println();
		}
	}
}
