package Stacks;

import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st = new Stack<>();//empty stack
		
		System.out.println(st.size());
		System.out.println(st.empty());
		
		st.push(10);
		st.push(20);
		st.push(30);
		
		System.out.println(st.size());
		System.out.println(st.peek());// shows which element is on top
		
		st.pop();
		
		System.out.println(st.peek());
		System.out.println(st.size());
		
		System.out.println(st);
	}

}
