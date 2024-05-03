package question05;

public class ReturnArray2 {
	static int[] makeArray(){
		
		int[] temp=new int[10];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i]=i+1;
		}
		return temp;
	}
	public static void main(String[] args) {
		int[] num;
		num = makeArray();
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+100+" ");
		}
	}
}
