package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairsOnLine {
	  /* Returns the number of ordered pairs
    (i, j) for which point (arr[i], arr[j])
    satisfies the equation of the line
    y = mx + c */
    static int findOrderedPoints(int arr[], int n, int m, int c){
        int counter = 0;
  
        // map stores the frequency
        // of arr[i] for all i
        HashMap<Integer,Integer> frequency = new HashMap<>();
         
        for(int i=0;i<n;i++){
            if(frequency.get(arr[i])==null){
                frequency.put(arr[i],1);
            }else{
                frequency.put(arr[i],frequency.get(arr[i])+1);
            }
        }
         
        for (int i = 0; i < n; i++)
        {
            int xCoordinate = arr[i];
            int yCoordinate = (m * arr[i] + c);
      
            // if for a[i](xCoordinate),
            // a yCoordinate exists in the map
            // add the frequency of yCoordinate
            // to the counter
             
            if (frequency.get(yCoordinate) !=null)
                counter += frequency.get(yCoordinate);
      
            // check if xCoordinate = yCoordinate,
            // if this is true then since we only
            // want (i, j) such that i != j, decrement
            // the counter by one to avoid points
            // of type (arr[i], arr[i])
            if (xCoordinate == yCoordinate)
                counter--;
        }
        return counter;
    }
     
    // Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find and print the result
        System.out.println(findOrderedPoints(arr, n, m, c));
    }
}



