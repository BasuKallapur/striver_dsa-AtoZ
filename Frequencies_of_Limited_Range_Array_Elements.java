import java.util.ArrayList;
import java.util.HashMap;

public class Frequencies_of_Limited_Range_Array_Elements {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        HashMap<Integer, Integer> mp= new HashMap<>();
        for(int i=0; i<N; i++){
            int key= arr[i];
            int freq= 0;
            if(mp.containsKey(key)){
                freq= mp.get(key);
            }
            freq++;
            mp.put(key, freq);
        }
        //queries
        // ArrayList<Integer> Alist= new ArrayList<>();
        for(int i=1; i<=N; i++){
            if(N<=P){
                if(mp.containsKey(i)){
                // Alist.add(mp.get(i));
                System.out.print(mp.get(i) + " ");
            }
            else{
                // Alist.add(0);
                System.out.print(0 + " ");
            }
            }
            
        }
        // System.out.println(Alist);
    }
    public static void main(String[] args){
        int arr[]= {2,3,2,3,5};
        int N= arr.length;
        int p= 5;
        frequencyCount(arr, N, p);
    }
}
