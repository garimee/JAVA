package java_interface;

interface Request {
	String getOrder();
}

class Customer {
	protected String menu;
	public Customer(String menu) {this.menu = menu;}
}

// 단골 손님
class CustomerA extends Customer implements Request {
	public CustomerA(String menu) {super(menu);}
	public String getOrder() {
		return "손님 A에게 " + menu + "을 준다";
	}
}

class CustomerB extends Customer implements Request {
	public CustomerB(String menu) {super(menu);}
	public String getOrder() {
		return "손님 B에게 " + menu + "을 준다";
	}
}

// 식당
class Restaurant {
	public void giveFood(Request res) {
		System.out.println(res.getOrder());
	}
}

public class order2 {

	public static void main(String[] args) {

		Restaurant owner = new Restaurant();
		Request a = new CustomerA("삼겹살");
		Request b = new CustomerB("소고기");
		
		owner.giveFood(a);
		owner.giveFood(b);
	}
	
	// 식당 주문 시스템을 만드는데 손님에게서 주문 요청이 들어오면 어떤 손님이든 getOrder() 메서드로 실행해야 한다
}
