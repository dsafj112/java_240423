package question02;

public class DoWhileTest {
	public static void main(String[] args) {
		int n=0;
		int sum=0;
		do {
			sum += n;
			n += 2;
		} while (n<=99);
		System.out.println(sum);
	}
}
