package FunctionsOfJava;

public class PrintAllPrimes {

		public static boolean checkPrime(int n) {

			int i=2;
			
			while(i <= n-1) {
				if (n % i == 0) {
					//System.out.println("Not Prime");
					return false;
				}
				i++;
			}
			//if(n==i)
				//System.out.println("Prime");
			return true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 13;
		
		int curr = 2;
		
		while(curr<=n) {
			if(checkPrime(curr)==true) {
				System.out.println(curr);
			}
			curr++;
		}
	}

}
