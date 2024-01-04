package stackandqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue_test {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		
		q.add("김");
		q.offer("노");
		q.offer("이");
		q.offer("최");
	
		System.out.println(q);
		System.out.println(q.remove()); // queue에서 꺼낼 값이 없을 경우 오류
		System.out.println(q.poll()); // queue에서 꺼낼 값이 없는 경우 null 값 출력
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		
		
		// 우선순위 큐
		Queue<String> pq = new PriorityQueue<String>();
		
		pq.offer("라디오");
		pq.offer("하마");
		pq.offer("나비");
		pq.offer("Boy");
		pq.offer("가방");
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
//		Deque - 이중 큐 (입출이 이중으로 되어 있는 큐)
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		dq.addFirst(10);
		dq.offerFirst(20);
		
		dq.addLast(5); // add 메서드 실행과 동일
		dq.offerLast(11); // offer 메서드 실행과 동일
		
		// removeFirst, pollFirst, removeLast, pollLast
		
		// deque를 스택으로 사용한다면 push, pop 메서드 사용 가능
		dq.push(111);
	}
	
}


// queue - 선입선풀, FIFO(처음 들어온 값이 첫 번째로 출력된다)