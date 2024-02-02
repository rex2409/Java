package Stacks;

public class DynamicStack extends StackUsingArrays{
	
	@Override
	public void push(int item) throws Exception {
		// TODO Auto-generated method stub
		//super.push(item);
		if(isFull()) {
			int[] newData = new int[2*data.length];
			
			for(int i = 0; i< data.length; i++) {
				newData[i] = data[i];
			}
			
			data = newData;
		}
		
		super.push(item);
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		DynamicStack st = new DynamicStack();
		
		for(int i = 1; i<=10; i++) {
			st.push(i);
		}
		st.display();
	}

}
