package question02;

public class ContinueSamYukGu {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i%3==0) { //(i==3||i==6||i==9) 
				System.out.print("짝 ");
				continue;
			}
				System.out.print(i+" ");
			
//			if (i%3==0) { //(i==3||i==6||i==9) 
//				System.out.print("짝 ");
//			} else {
//				System.out.print(i+" ");
//			}
		}
	}
}
