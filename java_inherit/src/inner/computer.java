package inner;

public class computer {
	
	int ram_speed = 3200;
	
	public void print() { // 인스턴스 메서드
		System.out.println("컴퓨터 사양");
	}
	
	class ram {
		public void print() {
			computer.this.print(); // 외부 클래스 메서드 실행
			System.out.println("메모리 사양");
		}
		public void getRam() {
			System.out.println("메모리 속도: " + ram_speed);
		}
	}
	
	static class vga {  // 내부 static 클래스
		static String brand = "RTX"; // 클래스 변수
		int GDDR_SIZE = 8; // 인스턴스 변수
		
		public void print() {
			System.out.println("그래픽카드 사양");
		}
	}
	
	class cpu {
	}
	
	public void OS_install() {
		int version = 11; // 메소드 안에 만들었으니 지역 변수
		
		class OS { // 메소드 안에 만든 클래스 - 로컬 클래스
			public void getOS() {
//				version = 10; // 로컬 클래스에서 지역 변수는 final이 붙은 상수로 사용된다
				System.out.println(version);
			}
		}
		
		new OS().getOS();
	}
}


// 내부 클래스 종류
// 인스턴스 클래스 - 외부 클래스의 인스턴스 변수 선언 위치에 정의
//              - 외부 클래스의 인스턴스 변수, 메서드와 관련된 작업을 할 경우
//			    - 인스턴스 클래스에서는 인스턴스 변수, 메서드만 사용 가능
//				- 외부 클래스의 static 변수, 메서드는 사용 불가

// static 클래스 - 내부 static 클래스에는 인스턴스 변수, 메서드와 static 변수, 메서드 모두 선언이 가능하다
//              - 외부 클래스의 인스턴스 변수, 메서드의 사용은 불가능하다
//				- 외부 클래스의 객체를 통한 객체 생성이 아니라 독자적으로 생성 가능
//				- static 변수, 메서드는 메모리에 하나만 올라가지만 static 클래스는 여러 개 생성이 가능하다 
//              - 외부 클래스의 인스턴스를 사용하지 않는 내부 클래스라면 내부 클래스를 static으로 선언한다 (일부 IDE에서는 경고가 뜬다)

// 로컬 클래스 - 메소드 내부에 위치하는 클래스
//      	 - 메소드 내부에서만 사용 가능
//			 - 접근제어자, static을 붙일 수 없다

// 익명 클래스 - 클래스의 이름이 존재하지 않는 클래스
//			 - 일회용 클래스
//           - 익명 클래스는 생성자가 없다
//			- 익명 클래스는 기존의 클래스 메서드를 재정의하여 사용하는 기법이다