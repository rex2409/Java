package Queue;

public class QueueUsingArrays {

	int[] data;
	int front;
	int size;
	
	public QueueUsingArrays() {
		this.data = new int[5];
		this.front = 0;
		this.size = 0;
	}
	
	public QueueUsingArrays(int cap) {
		this.data = new int[cap];
		this.front = 0;
		this.size = 0;
	}
	
	public boolean isFull() {
		return size == data.length;
	}
	
	public void enqueue(int val) throws Exception {//insert
		
		if(isFull()) {
			throw new Exception("Queue is Full");
		}
		
		int idx = this.front + this.size;
		idx = idx % data.length;// circular enqueue
		data[idx] = val;
		size++;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int dequeue() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		
		int temp = data[front];
		data[front] = 0;
		front++;
		front = front % data.length;//circular dequeue
		size--;
		
		return temp;
	}
	
	public int getFront() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		
		return data[front];
	}
	
	public void display() {
		for(int i = 0; i < data.length; i++) {
			int idx = i+front;
			idx = idx % data.length;
			System.out.print(data[idx] + " ");
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		
		QueueUsingArrays q = new QueueUsingArrays();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		//q.enqueue(60);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		//System.out.println(q.dequeue());
		//System.out.println(q.dequeue());
		//System.out.println(q.dequeue());
		
		System.out.println(q.size+ " " +q.front);
		
		//System.out.println(q.dequeue());
		
		System.out.println(q.getFront());
		
		q.display();
	}
}
