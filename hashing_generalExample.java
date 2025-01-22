import java.util.Scanner;

public class hashing_generalExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // //if you want to take input from user
        // System.out.println("enter lenght of array: ");
        // int n= sc.nextInt();
        // int[] arr= new int[n];
        // System.out.println("lenght of array is: " + arr.length);

        // //reading array elements
        // System.out.println("enter array values: ");
        // for(int i=0; i<n; i++){
        //     arr[i]= sc.nextInt();
        // }

        // direct declaration
        int arr[]= {1,0,2,2,5};
        int n= arr.length;

        //precompute
        int hash[] = new int[n+1];
        for(int i=0; i<n; i++){
            hash[arr[i]]++;
        }
        
        //query
        System.out.println("enter number of query: ");
        int q= sc.nextInt();
        while (q-- > 0) {
            int number= sc.nextInt();
            System.out.println(" number of times of "+ number + " is " + hash[number]);
        }
    }
}
