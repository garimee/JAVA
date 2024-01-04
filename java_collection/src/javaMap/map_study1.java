package javaMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class map_study1 {

	public static void main(String[] args) {
		HashMap<String, String> hash = new HashMap<>();
		
		hash.put("김", "오늘도 웹툰");
		hash.put("박", "영상?웹툰?보고있나");
		hash.put("서", "짝꿍");
		hash.put("남", "잠");
		hash.put("김", "1");
		
		System.out.println(hash);
		
		System.out.println(hash.get("박"));
		
		Set<String> keys = hash.keySet();
		System.out.println(keys);
		
		Collection<String> val = hash.values();
		System.out.println(val); 
		
		hash.remove("서"); // 삭제 - key와 value 삭제
		System.out.println(hash);
		
		hash.replace("김", "?");
		System.out.println(hash);
		
		System.out.println(hash.containsKey("김민지"));  // key와 일치하는 값 존재 여부
		System.out.println(hash.containsValue("영상?웹웹웹툰....?")); // value 값 존재 여부 
		
		hash.forEach(
			(key, value) -> {
				System.out.println(key + " " + value);
			}
		);
	}
}

// Map - HashMap: 단일 검색, 해시 테이블이라는 배멸에 접근하기 때문에 검색 시간이 일정하다
//	   - TreeMap: 범위 검색, 이진트리 구조를 사용하기 때문에 기본 정렬을 유지, 검색 시간은 데이터 양에 비례한다
//		 key:value , key는 중복을 허용하지 않는다  value는 중복 허용
//		 HashMap에서 key는 null을 허용하지만 TreeMap은 허용하지 않는다