package queation04;

public class CoronaSum {
	public static void main(String[] args) {
		int[][] num=new int[12][3];
		int sum=0;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j]=(i+1)*10+1+j;
				sum+=num[i][j];
			}
		}
		System.out.println("1년 전체 코로나 환자수는 "+sum);
	}
}
