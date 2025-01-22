import java.util.HashMap;
import java.util.Scanner;

public class hashingUsingMaps {
    public static void main(String[] args) {
        System.out.println("enter lenght of array: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("lenght of array is: " + arr.length);

        //reading array elements
        System.out.println("enter array values: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        // precompute frequecny using hashmap
        HashMap<Integer, Integer> mp= new HashMap<>();
        for(int i=0; i<n; i++){
            int key= arr[i];
            int freq= 0;
            if (mp.containsKey(key)) {
                freq= mp.get(key);
            }
            freq++;
            mp.put(key, freq);
        }

        //queries
        System.out.println("enter number of queries: ");
        int q= sc.nextInt();
        for(int i=0; i<q; i++){
            System.out.println("enter query value: ");
            int query= sc.nextInt();
            System.out.println("frequency of " + query + " is: " );
            if (mp.containsKey(query)) {
                System.out.print(mp.get(query));
            }
            else{
                System.out.print(0);
            }
        }
    }
}
