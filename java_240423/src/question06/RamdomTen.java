package question06;

public class RamdomTen {
	public static void main(String[] args) {
		int[] num=new int[10];
		double sum=0;
		
		System.out.print("랜덤한 정수들 : ");
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*11);//난수를 배열에 저장
			sum+=num[i];//배열 원소의 누적 합계
			System.out.print(num[i]+" ");
		}
//		System.out.println();=\n
		System.out.println("\n평균은 "+sum/num.length);
	}
}
