package inherit_test;

public class computer extends house {

	float cpu;
	int ram;
	
	computer(){}
	computer(String brand, float cpu, int ram) {
		super(brand);
		this.cpu = cpu;
		this.ram = ram;
	}
	
	public void power() {
		onoff = !onoff;
		System.out.println("컴퓨터 전원: " + onoff);
	}
	
	@Override
	public String toString() {
		return super.brand + " , cpu: " + cpu + "Gh + ram: " + ram + "Gb"; 
	}
}
