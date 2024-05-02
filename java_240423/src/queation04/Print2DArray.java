package queation04;

public class Print2DArray {
	public static void main(String[] args) {
//		열의 크기가 각각 달라서 비정방형 배열
		int n [][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		for (int i = 0; i < n.length; i++) {//n.length: 5
			for (int j = 0; j < n[i].length; j++) {
//				n[i][j] : 2차원 배열원소
				System.out.print(n[i][j]+"");
			}
//			int[] m=n[i];
//			for (int j = 0; j < m.length; j++) {//m.length: 1,3,1,4,2
//				System.out.print(m[j]+"");
//			}
			System.out.println();
		}
	}
}
