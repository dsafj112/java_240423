package chapter12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysTest2 {
	public static void main(String[] args) {
		String[] a= {"a","b","c","d"};
		int[] b= {1,5,5,7,3,3,42,6,8,45323,4,63,2,1};
		System.out.println(Arrays.asList(a));//List로
		List<String> list = Arrays.asList(a);
		System.out.println("@# list.get(0)===>"+list.get(0));
		
		Arrays.sort(b, 4, 14);//인덱스정렬(4~13)
		System.out.println(Arrays.toString(b));
//		{1,5,5,7,3,3,42,6,8,45323,4,63,2,1}
//		=>
//		[1, 5, 5, 7, 1, 2, 3, 3, 4, 6, 8, 42, 63, 45323]
		Arrays.sort(b);//오름차순정렬
//		[1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 45323]
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(a, Collections.reverseOrder());//문자열 배열을 거꾸로(내림차순)
//		[d, c, b, a]
		System.out.println(Arrays.toString(a));//String으로
		
		Arrays.sort(a);
//		[a, b, c, d]
		System.out.println(Arrays.toString(a));//String으로
		
		Arrays.sort(a,2,4,Collections.reverseOrder());//인덱스 2부터3까지 거꾸로(내림차순)
//		[a, b, d, c]
		System.out.println(Arrays.toString(a));//String으로
		
		String[] cc= {"11","12","13","23","53","224","145","53"};
		Arrays.sort(cc, Collections.reverseOrder());
//		[53, 53, 23, 224, 145, 13, 12, 11] //앞의 숫자가 큰것부터 내림차순
		System.out.println(Arrays.toString(cc));//String으로
		
		int[] c = Arrays.copyOf(b, b.length);//배열객체를 복사
//		[1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 45323]
		System.out.println(Arrays.toString(c));//String으로
		
		String[] d = Arrays.copyOf(a, 3);//a배열 객체를 크기 3인 객체로 복사
//		[a, b, d]
		System.out.println(Arrays.toString(d));//String으로
	}
}
