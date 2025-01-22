import java.util.HashMap;
import java.util.Scanner;

public class someMorePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter array values: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        //precompute
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

        //query
        System.out.println("enter number of queries: ");
        int q= sc.nextInt();
        System.out.println("enter query values: ");
        while (q-- > 0) {
            int qv= sc.nextInt();
            System.out.println("freq is: ");
            if (mp.containsKey(qv)) {
                System.out.println(mp.get(qv));
            }
            else{
                System.out.println(0);
            }
        }



        // for(int i=0; i<q; i++){
        //     System.out.println("frequency of " + i + "is: ");
        //     if (mp.containsKey(i)) {
        //         System.out.println(mp.get(i));
        //     }
        //     else {
        //         System.out.println(0);
        //     }
        // }




    }
}
