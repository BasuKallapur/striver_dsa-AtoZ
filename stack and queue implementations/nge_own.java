import java.util.Arrays;
import java.util.Stack;

public class nge_own {

    public static int[] nge(int arr[]){
        int n= arr.length;
        int res[]= new int[n];
        Stack<Integer> st= new Stack<>();

        for(int i=n-1; i>=0; i--){
            int currEle= arr[i];
            while(!st.isEmpty() && currEle > st.peek()) st.pop();
            if(st.isEmpty()) res[i]= -1;
            else res[i]= st.peek();
            st.push(currEle);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5};
        System.out.print("array is: ");
        System.out.println(Arrays.toString(arr));
        
        int[] ans= nge(arr);
        System.out.println(Arrays.toString(ans));
    }
}
