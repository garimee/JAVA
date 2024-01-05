package cafe;

public class Order {

	// 전체 메뉴 보여 주는 메서드: 분류(커피, 음료, 빽스치노) 선택 - 해당 분휴에서 제품 이름 입력하여 주문
	// 커피 메뉴를 선택하여 보다가 음료 메뉴를 보고 싶으면 이동하면 보이게 해 줘야한다
	public static void kiosk() {
		System.out.println("\n========주문========\n");
		
		Category main = Category.커피;
		while(true) {
			System.out.println("1. 커피  2. 음료  3. 빽스치노");
		}
	}
	
	// 주문 진행하는 메서드: 주문할 제품을 선택했다면 결제까지 진행되는 메서드
	
	// 주문 내역을 Order_history를 통해 저장 메서드
}
