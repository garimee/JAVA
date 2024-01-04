package Linked;

public class linkedList {

	static int cnt = 0;
	private node head = null; // linkedList의 맨 앞 노드
	private node tail = null; // linkedList의 맨 뒤 노드
	
	// 데이터 추가
	public void add(String name) {
		node temp = new node(name);
		temp.index = cnt;
		cnt++;
		
		if(head == null) {
			head = temp;
			tail = temp;
		} else {
			tail.setNext(temp);
			tail = temp;
		}
	}
	
	// 데이터 출력
	public node get(int index) {
		
		node find = head; // linkedList 첫 번째 노드부터 시작
		while(find != null) {
			if(find.index == index) {
				return find;
			}
			find = find.getNext();
		}
		return null;
	}
	
	// 데이터 삭제
	public boolean remove(int index) {
		
		node find = head; // 첫 번째 노드부터 시작
		
		if(head.index == index) { // 첫 번째 노드 삭제
			head = head.getNext();
		} else {
			
		}
		
		while(find.getNext() != null) {
			if(find.getNext().index == index) {
				node del = find.getNext(); // 삭제할 노드 del에 저장
				find.setNext(del.getNext()); // del의 next를 앞쪽 node next에 저장
			}
			
			find = find.getNext();
		}

		return false;
	}
	
	// 데이터 삽입
	public void add(int index, String name) {
		
	}
	
	// linkedList 전체 출력
	@Override
	public String toString() {
		
		String out = "[";
		node move = head; // linkedList의 첫 번째 노드
		
		while(move != null) { // 마지막 노드의 next는 null이기 때문에
			out += move.getName() + "\n";
			move = move.getNext(); // 현재 노드에서 다음 노드로 이동
		}
		
		out += "]";
		
		return out;
	}
}
