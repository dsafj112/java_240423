package question06;

public class TV {
	String maker;
	int year;
	int inch;
	
	public TV(String a,int b,int c) {
		maker=a;
		year=b;
		inch=c;
	}
	
	public void show() {
		System.out.println(maker+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
	
	public static void main(String[] args) {
		TV myTV=new TV("LG",2017,32);
		myTV.show();
	}
}
