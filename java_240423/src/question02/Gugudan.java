package question02;

public class Gugudan {
	public static void main(String[] args) {
//		구구단 : 이중 for문
		int res;
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				res = i * j;
//				System.out.print("i ===>"+i);
//				System.out.println();
//				System.out.print("j ===>"+j);
//				System.out.println();
				System.out.print(i+"*"+j+"="+res+"\t");//@@탭으로 띄어서 정렬되게 출력
			}
//			단이 끝날때 마다 엔터
			System.out.println();
		}
	}
}
