package chapter03;

/*
 * 열거형 이용(+values() 메소드 이용)
 * foreach 이용
 */
public class foreachEx {
//	열거형: inner class(내부 클래스) 형태
	enum Week{월,화,수,목,금,토,일};
	
	public static void main(String[] args) {
		int[] n= {1,2,3,4,5};
		String names[]= {"사과","배","바나나","체리","딸기","포도"};
		int sum=0;
		
//		int 타입 배열원소 n을 k로 하나씩 받는다.
		for (int k : n) {
			System.out.print(k+" ");
			sum += k;
		}
		System.out.println("합은 "+sum);
		
		for (String s : names) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		for (Week day : Week.values()) {//Week 타입값을 day로 하나씩 받을때 values사용
//			String str = day;// 오류 : 열거형 값을 String으로 받을 수 없다.
			Week str = day;
			System.out.print(str+"요일 ");
//			System.out.print(day+"요일 ");
		}
	}
}
