package Greedy;

public class JumpGame {

	public boolean canJump(int[] arr) {
		int health = 0;
		for(int curr = 0; curr<arr.length; curr++) {
			health = Math.max(arr[curr], health-1);
			if(health<=0) {
				return false;
			}
		}
		return true;
	}
	
	
}
