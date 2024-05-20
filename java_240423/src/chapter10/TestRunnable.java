package chapter10;

public class TestRunnable {
	public static void main(String[] args) {
		//Runnable 로 만드 스레드는 Thread 객체의 생성자로 호출
		Thread th = new Thread(new TimerRunnable());
//		TimerRunnable th = new TimerRunnable();//무조건 class Thread는 거쳐야함??
		th.start();
	}
}
