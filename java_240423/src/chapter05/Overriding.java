package chapter05;

class Weapon{
	protected int fire() {//스타크래프트-파이어백
		return 1;//기본 공격럭:1
	}
}
class Cannon extends Weapon{
	@Override//@는 어노테이션(시스템 주석)=>생략해도 문제 없음
	protected int fire() {
		return 10;//탱크 동격력:10
	}
}

public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 "+weapon.fire());//1
		
		weapon = new Cannon();//upcasting
		System.out.println("대포의 살상 능력은"+weapon.fire());//10
		Weapon cannon = (Cannon) weapon;//downcasting
		System.out.println("대포의 살상 능력은"+cannon.fire());//10
	}
}
