package study1220;

public class member {
	static String company; // 클래스 변수
	int num; // 인스턴스변수
	String name; // 인스턴스변수
	int age; // 인스턴스변수
	
	public String toString() {
		return "번호: " + num + " 이름: " + name + " 나이: " + age; 
	}
} 

// 인스턴스 변수와 클래스 변수의 초기화
// 자바에서 class 내부의 변수들 초기화 방법
// 명시적 초기화 - 변수 선언과 동시에 데이터 저장
// 초기화 블럭 - 인스턴스 초기화 블럭 : {}
//          - 클래스 초기화 블럭 : static {}
// 초기화 진행 순서
// 명시적 초기화 > 초기화블럭 > 생성자메서드

// 지역변수 : 생성 - 메서드나 제어문이 시작할 때 생성
//          소멸 - 메서드나 제어문이 종료되면 소멸
// 인스턴스변수 : 생성 - 클래스의 객체 생성 시 생성 (클래스 정의만으로는 생성 안 됨)
// (인스턴스메서드) 소멸 - 객체가 소멸되면 소멸 (객체는 운영체제나 jvm에 의해 정리될 때)
// 클래스 변수 : 생성 - 프로그램이 실행되면서 클래스 정의 부분을 jvm이 로드할 때 생성
// (클래스메서드) 소멸 - 프로그램 종료 