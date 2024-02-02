package Queue;

public class DynamicQueue  extends QueueUsingArrays{

	@Override
	public void enqueue(int val) throws Exception {
		// TODO Auto-generated method stub
		//super.enqueue(val);
		
		if(size == data.length) {
			int[] newData = new int[data.length*2];
			
			for(int i = 0; i < data.length; i++) {
				int idx = i+front;
				idx = idx % data.length;
				newData[i] = data[idx];
			}
			
			data = newData;
			front = 0;
		}
		
		super.enqueue(val);
	}
	
	public static void main(String[] args) throws Exception {
		DynamicQueue q = new DynamicQueue();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		
		q.display();
	}
}
