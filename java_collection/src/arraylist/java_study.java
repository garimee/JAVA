package arraylist;

import java.util.ArrayList;

public class java_study {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		
		arr.add(10);
		arr.add(20);
		arr.add(50); // 배열의 마지막에 새로운 데이터 추가
		arr.add(1, 100); // 배열의 지정한 인덱스 위치에 새로운 데이터 추가
		
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i)> 20)
			System.out.println(arr.get(i));
		}
		
		System.out.println("arraylist의 값 존재 여부 contains " + arr.contains(20));
		System.out.println("값이 몇 번째 인덱스 indexOf " + arr.indexOf(50));
		System.out.println("arraylist에 값이 몇 개 있나 size " + arr.size());
		arr.remove(2); // 지정한 인덱스 위치의 값 삭제
		System.out.println("arraylist 비어있냐 isEmpty " + arr.isEmpty());
		
		System.out.println("범위 내 값 출력 subList " + arr.subList(1, 3));
	}
}

// ArrayList - 기존의 배열을 동적으로 사용하기 위한 클래스
//			 - 기존 배열과 다른 점은 여러 타입으로 지정해서 사용할 수 있다 (제네릭)
//			 - ArrayList에 기본 데이터 타입은 Object라는 자바 최상위 클래스 타입이다
//			 - Object 타입으로 저장되기 때문에 사용하고자 하는 타입을 지정해서 사용해야 한다
//			 - ArrayList처럼 collection의 모든 클래스들은 타입을 지정해서 사용해야 한다

// ArrayList<클래스> - ArrayList(동작 배열)에 저장할 데이터(객체) 타입을 <> 안에 작성하여 사용해야 한다
//				    - <> 안에 넣어 주면 해당 타입으로 동작되도록 하는 방법은 제네릭이다
//					- 제네릭은 사용자가 지정한 타입에 맞추어 사용할 수 있도록 자바에서 제시하는 방법
//					- 제네릭을 사용하

// 자바 컬렉션 - 다수의 데이터 또는 다수의 객체를 저장, 관리, 가공하기 위한 자료 구조 및 알고리즘을 개발자가 쉽게 사용할 수 있도록 만들어 놓은 인터페이스 및 클래스이다

// Collection, Map
// Collection - List (자식 인터페이스) - ArrayList, Vector, LinkedList, Stack 
//			  - Set (자식 인터페이스) - HashSet, TreeSet

// Map - HashTable
//	   - HashMap
//	   - TreeMap