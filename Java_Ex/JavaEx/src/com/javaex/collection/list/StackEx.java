package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		//	스택 선언
		Stack<Integer> st = new Stack<>();
		
		//	데이터 입력
		for (int i = 0; i<10; i++) {
			st.push(i);
			System.out.println("Stack: "+st);
		}
		System.out.println("PEEK: " + st.peek());
		System.out.println("Stack: "+st);
		
		//	인출
		for (;!st.empty();) {
			st.pop();
			System.out.println("Stack: "+st);
		}
		System.out.println("Stack: "+st);
		
		//	Stack 비어있는지 확인해야 한다.
//		while(!st.empty()) {
		
		}
	}


