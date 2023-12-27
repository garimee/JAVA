package inherit_test;

public class tv extends house {

	int ch = 7; // 채널
	int vol = 15; // 음량
	
	{
		ch = 10;
		vol = 12;
	}
	
	tv() { // 기본 생성자 메서드
		System.out.println("tv 클래스의 생성자입니다");
	}
	
	public tv(String brand) { // 매개변수가 있는 생성자 메서드
		super(brand); // super - 자신이 상속받는 부모를 가르키는 참조 변수
	}
	
	public void power() {
		onoff = !onoff;
		System.out.println("TV 전원: " + onoff);
	}
	@Override
	public String toString() {
		return super.brand + " , 전원: " + super.onoff + " 현재 채널: " + ch + "볼륨: " + vol;
	}
}
