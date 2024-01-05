package javaMap;

import java.util.Properties;
import java.util.TreeMap;

public class map_study2 {
	
	public static void main(String[] args) {
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		tree.put(101, "서울특별시");
		tree.put(204, "인천광역시");
		tree.put(406, "대전광역시");
		tree.put(201, "광주광역시");
		tree.put(701, "대구광역시");
		tree.put(702, "울산광역시");
		tree.put(703, "부산광역시");
		
		System.out.println(tree);
		
		// 검색
		System.out.println(tree.ceilingEntry(205)); // 지정한 키 값보다 크거나 같은 값 중 가장 작은 키:value 반환
		
		System.out.println(tree.floorEntry(300)); // 지정한 키 값보다 작거나 같은 값 중 큰 key:value 반환
		
		System.out.println(tree.floorKey(300)); // 지정한 키 값보다 작거나 같은 값 중 가장 큰 key 반환
		
		System.out.println(tree.higherEntry(406)); // 지정한 키 값보다 큰 값 중에서 가장 가까운 key:value 반환
		// higherKey() 키만 반환 || lowerEntry() 지정한 키 값보다 작은 값 중에서 가장 가까운 엔트리 반환 || lowerKey() 키만 반환
		
		System.out.println(tree.firstEntry());
		// 현재 맵에서 가장 작은 키를 가진 엔트리 반환
		// firstKey() 키만 반환
		
		System.out.println(tree.lastEntry());
		// 현재 맵에서 가장 큰 key를 가진 엔트리 반환
		// lastKey() 키만 반환
		
		System.out.println(tree.pollLastEntry());
		// 가장 큰 key를 가진 엔트리를 반환하고 맵에서 삭제
		// pollFirstEntry() 가장 큰 key를 가진 엔트리를 반환하고 맵에서 삭제
		
		System.out.println(tree.headMap(500));
		// 지정한 키 값보다 작은 키 값들을 반환한다 - 지정한 키 포함
		// tailMap() - 지정한 키 값보다 큰 키 값들을 반환한다 - 지정한 키 포함
		// headMap(), tailMap()의 두 번째 인자를 false 넘겨 주면 지정한 키는 포함하지 않는다
		
		System.out.println(tree.subMap(200, 600));
		// subMap(from, to) - from 키 값부터 to 키 값 전까지에 해당하는 엔트리들을 반환
		
		Properties prop = new Properties();
		prop.put("월요일", "한 주 시작...");
		prop.put("토요일", "내일부터... 쉬는 날이 아니네");
		prop.put("수요일", "수요일마다 야외 수업?");
		prop.put("화요이일", "아직 2일 지났다");
		System.out.println();
	}
}
