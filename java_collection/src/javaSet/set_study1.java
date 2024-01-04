package javaSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class set_study1 {

	public static void main(String[] args) {
//		HashSet<Integer> set = new HashSet<Integer>();
//		
//		set.add(10);
//		set.add(20);
//		set.add(30);
//		set.add(40);
//		set.add(50);
//		set.add(60);
//		set.add(70);
//		
//		System.out.println(set);
		
		
		HashSet<String> 안경쓴사람 = new HashSet<String>();
		HashSet<String> 팥붕어빵 = new HashSet<String>();
		HashSet<String> 슈붕어빵 = new HashSet<String>();
		
		안경쓴사람.add("남"); 안경쓴사람.add("이"); 안경쓴사람.add("김");
		안경쓴사람.add("노"); 안경쓴사람.add("송"); 안경쓴사람.add("환");
		안경쓴사람.add("의"); 안경쓴사람.add("종"); 안경쓴사람.add("강");
		
		팥붕어빵.add("노"); 팥붕어빵.add("서"); 팥붕어빵.add("의"); 
		팥붕어빵.add("강"); 팥붕어빵.add("환"); 팥붕어빵.add("박");
	
	
		슈붕어빵.add("남"); 슈붕어빵.add("이"); 슈붕어빵.add("희");
		슈붕어빵.add("김"); 슈붕어빵.add("여"); 슈붕어빵.add("송");
		슈붕어빵.add("인"); 슈붕어빵.add("종");
		
		HashSet<String> 팥X안경 = new HashSet<String>();  // 슈붕어빵 좋아하는 안경 쓴 사람
		Iterator<String> it = 안경쓴사람.iterator(); // 교집합
		while(it.hasNext()) {
			String name = it.next();
			if(슈붕어빵.contains(name)) {
				팥X안경.add(name);
			}
		}
		System.out.println(팥X안경);
		
		// 차집합
		// 팥을 좋아하면서 안경을 쓰지 않은 사람
		HashSet<String> 안경X팥좋아 = new HashSet<String>();
		it = 팥붕어빵.iterator();
		while(it.hasNext()) {
			String name = it.next();
			if(!안경쓴사람.contains(name)) {
				안경X팥좋아.add(name);
			}
		}
		
		System.out.println(안경X팥좋아);
		
		// 합집합
		// 안경 착용하거나 슈붕을 좋아하거나
		HashSet<String> 안경과슈 = new HashSet<String>();
		it = 슈붕어빵.iterator();
		while(it.hasNext()) {
			안경과슈.add(it.next());
		}
		it = 안경쓴사람.iterator();
		while(it.hasNext()) {
			안경과슈.add(it.next());
		}
		System.out.println(안경과슈);
		
		// 메서드를 사용하여 합집합 구하기
		안경과슈.clear();
		안경과슈.addAll(안경쓴사람);
		안경과슈.addAll(슈붕어빵);
		System.out.println(안경과슈);
		
		// 부분집합 - A집합의 값 일부가 B집합으로 만들어진 경우 B집합은 A의 부분집합이라고 한다
		System.out.println(안경쓴사람.containsAll(팥붕어빵));
		System.out.println(안경과슈.containsAll(슈붕어빵));
		
		List<String> names = new ArrayList<String>(안경과슈); // HashSet > ArrayList 변환
		System.out.println(names);
	}

}


// Set - 입력한 데이터 순서 유지 안 됨 (힙이라는 메모리 공간을 사용하기 때문에 메모리 주소, 크기 등에 의해 순서 변경이 된다)
//	   - 중복을 허용하지 않는다
//	   - 데이터들의 그룹화 목적으로 사용
//	   - HashSet: 수학에서의 집합을 표현하기 위한 클래스
//	   - TreeSet: 검색, 정렬의 목적으로 사용되는 클래스

// 교집합 - 두 개 이상의 집합에 공통으로 존재하는 값의 집합체
// 차집합 - A집합과 B집합에서 A집합에만 존재하는 값
// 합집합 - A집합과 B집합을 합쳤을 때 중복을 제외한 값