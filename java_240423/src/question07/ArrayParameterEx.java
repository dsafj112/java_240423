package question07;

public class ArrayParameterEx {
	static void printStringArray(String a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	static void replaceBe(String b[]) {
		for (int i = 0; i < b.length; i++) {
			if (b[i].equals("be")) {
				b[i]="eat";
			}
		}
	}
	
	public static void main(String[] args) {
		String s[] = {"to"," ","be"," ","or"," ","not"," ","to"," ","be"};
		printStringArray(s);
		replaceBe(s);
		printStringArray(s);
	}
}
