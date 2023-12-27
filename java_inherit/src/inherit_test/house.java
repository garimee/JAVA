package inherit_test;

public abstract class house {
	
	public static int makedate = 20231209; // 클래스 변수
	
	public boolean onoff;
	String brand;
	public int sn = 10000; // 시리얼넘버
	
	protected house() { // 기본 생성자 메서드
		onoff = false;
		System.out.println("나는 부모 house 클래스 생성자");
	}
	
	public house(String brand) {
		this.brand = brand;
	}
	
	public abstract void power();

}
