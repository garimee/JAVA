package study1220;

import java.util.Arrays;

public class what_class {
	public static void main(String[] args) {
		
		member.company = "애플";
		
		member m1 = new member(); // member 클래스의 인스턴스 생성
		m1.age = 34;
		m1.name = "이순신";
		m1.num = 101;
		System.out.println(m1);
		m1.company = "삼성";
		System.out.println(m1.company);
		
		// 클래스 - 사용자 정의 데이터 타입
		// 기존의 기본 데이터 타입이 아닌 새로운 형태의 타입을 직접 정의하는 것
		// 기본 데이터타입과의 차이점은 여러 종류의 데이터를 다룰 수도 있으며 기능(메서드)을 정의할 수 있다
		
		// 변수 - 지역변수, 인스턴스변수, 클래스변수
		// 인스턴스변수 - 클래스의 멤버 변수 (클래스 객체의 실제 데이터를 저장하는 변수)
		// 클래스변수 - 클래스의 전역번수와 같은 것 (공유변수)
		
//		car c1 = new car(); // 클래스의 객체 생성 (인스턴스 생성)
//		c1.carNum = 12300;
//		c1.carName = "소나타";
//		System.out.println(c1);
//		
//		car c2 = new car();
//		c2.carNum = 32433;
//		c2.carName = "제네시스";
//		System.out.println(c2);
//		
//		car[] c = new car[10]; // car 클래스의 참조변수 공간 10개 생성
//		
//		for(int i = 0; i < c.length; i++) {
//			c[i] = new car(); // car 클래스의 객체 생성 (인스턴스변수와 메서드 공간 생성)
//			c[i].carNum = i + 10000 + (int)(Math.random() * 10000);
//			c[i].carName = "쏘렌토";
//		}
//		System.out.println(Arrays.toString(c));
//	}
//}
//
//class car {  // 클래스명이 car인 클래스 정의, 클래스의 정의 부분이고 공간 생성이 아니다
//	int carNum; // 인스턴스변수
//	String carName; // 인스턴스변수
//	
//	public String toString() {
//		return carNum + " " + carName;
	}
}