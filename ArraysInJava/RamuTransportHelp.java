package ArraysInJava;

import java.util.Scanner;

public class RamuTransportHelp {

	public static int min(int a, int b) {
		return (a<b) ? a:b;
	}
	
	public static void ticketCost(int[] c, int n, int m, int[] a, int[] b) {
		int sum_rick_c1 = 0, sum_cab_c1=0;
		
		for(int i = 0; i<n; i++) {
			int rick_c1 = min((a[i]*c[0]),c[1]);
			sum_rick_c1 += rick_c1;
		}
		
		int totalrickshawcost = min(sum_rick_c1,c[2]);
		
		for(int i = 0;i<m;i++) {
			int cab_c1 = min((b[i]*c[0]),c[1]);
			sum_cab_c1 += cab_c1;
		}
		
		int totalcabcost = min(sum_cab_c1,c[2]);
		
		int total_ticket_cost = min((totalrickshawcost+totalcabcost),c[3]);
		
		System.out.println(total_ticket_cost);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0;i<t;i++) {
			int[] c = new int[4];
			for(int j = 0; j<4;j++) {
				c[j]=sc.nextInt();
			}
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] a = new int[n];
			for(int k = 0; k<n; k++) {
				a[k] = sc.nextInt();
			}
			int[] b = new int[m];
			for(int l = 0;l<m;l++) {
				b[l] = sc.nextInt();
			}
			ticketCost(c,n,m,a,b);
		}
	}

}
