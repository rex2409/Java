package Greedy;

public class GasStation {

	public int canCompleteCircuit(int[] gas, int[] cost) {
		int sum = 0;
		int sum_kad = 0;
		int start = 0;
		for(int idx = 0; idx < gas.length; idx++) {
			int ct = gas[idx] - cost[idx];
			sum = sum + ct;
			sum_kad = sum_kad + ct;
			if(sum_kad<0) {
				sum_kad = 0;
				start = idx+1;
			}
		}
		if(sum<0) {
			return -1;
		}
		else {
			return start;
		}
	}
}
