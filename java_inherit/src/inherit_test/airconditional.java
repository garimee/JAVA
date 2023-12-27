package inherit_test;

public class airconditional extends house {

	int temp = 22;
	int speed = 1;
	
	airconditional() {}
	airconditional(String brand) {
		super(brand);
	}
	
	public void power() {
		onoff = !onoff;
		System.out.println("에어컨 전원: " + onoff);
	}
	
	@Override
	public String toString() {
		return super.brand + ", 전원: " + super.onoff + "  온도: " + temp + "℃  바람: " + speed;
	}
}
