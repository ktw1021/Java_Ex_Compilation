package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueEx {

	public static void main(String[] args) {
		//	Queue 선언
		//	클래스가 아니라 인터페이스임.
		//	순서 O, 중복허용 - 중간 삽입, 삭제 X
		//	실제 저장은 LinkedList의 기능을 활용
		Queue<Integer> queue = new LinkedList();
		
		for (int i = 0; i<10; i++) {
			queue.offer(i);
			System.out.println("QUEUE"+queue);
		}
		
		System.out.println("PEEK: " +queue.peek());	//	출력 방향의 데이터 확인
		System.out.println("POLL: "+queue.poll());
		System.out.println("QUEUE: " + queue);
		
		//	poll 할 때는 비어있는지 체크
		while (!queue.isEmpty()); {	//	큐가 비어있지 않은 동안 루프
			System.out.println("POLL: "+queue.poll());
			System.out.println("QUEUE: "+queue);
		}
		
	}

}
