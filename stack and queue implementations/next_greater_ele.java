import java.util.Arrays;
public class next_greater_ele {
    public static int[] nge(int arr[]){
        int n= arr.length;
        int ans[]= new int[n];
        
        for(int i=0; i<=n-1; i++){
            int currNum= arr[i];
            ans[i]= -1;
            for(int j=i+1; j<=n-1; j++){
                if(currNum < arr[j]) {
                    ans[i]= arr[j];
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5};
        System.out.print("array is: ");
        System.out.println(Arrays.toString(arr));
        
        int[] ans= nge(arr);
        System.out.println(Arrays.toString(ans));
    }
}
