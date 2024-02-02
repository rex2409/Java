package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {

	private static boolean placed(int mindist, int numcows, int[] stalls) {
		
		int prevpos = stalls[0];
		int numplaced = 1;
		
		for(int i = 1; i< stalls.length;i++) {
			int stallpos = stalls[i];
			if(stallpos - prevpos >= mindist) {
				numplaced++;
				prevpos = stallpos;
			}
			
			if(numplaced == numcows) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] stalls = {1,2,8,4,9};
		
		int numcows = 3;
		
		Arrays.sort(stalls);
		
		int l=0, r = stalls[stalls.length-1] - stalls[0];
		
		while(r>l+1) {
			int mindist = (r+l)/2;
			
			if(placed(mindist,numcows,stalls)) {
				l = mindist;//l=mid
			}
			else {
				r = mindist;
			}
		}
		
		System.out.println(l);
	}

}
