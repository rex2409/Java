package Stacks;

public class StackUsingArrays {

	int[] data;
	int tos;
	
	public StackUsingArrays() {//predefined capacity constructor
		this.data = new int[5];
		this.tos = -1;
	}
	
	public StackUsingArrays(int capacity) {//user defined capacity constructor
		this.data = new int[capacity];
		this.tos = -1;
	}
	
	public int size() {//method
		return this.tos + 1;
	}
	
	public boolean isEmpty() {//method
		return this.size() == 0;
	}
	
	public boolean isFull() {//method
		return this.size() == data.length;//data.length tells us the the max elements that can be placed
	}
	
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is FULL!");
		}
		tos++;
		data[tos] = item;
	}
	
	public int pop() throws Exception{
		
		if(isEmpty()) {
			throw new Exception("Stack is EMPTY!");
		}
		
		int temp = data[tos];
		data[tos] = 0;
		tos--;
		return temp;
	}
	
	public int peek() throws Exception{
		
		if(isEmpty()) {
			throw new Exception("Stack is EMPTY!");
		}
		
		return data[tos];
	}
	
	public void display() {
		
		for(int i = tos; i >=0; i--) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws Exception {
		StackUsingArrays st = new StackUsingArrays();
		
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
		
		for(int i = 1; i<=5; i++) {
			st.push(i);
		}
		
		System.out.println(st.pop());
		System.out.println(st.peek());
		
		st.display();
	}
}
