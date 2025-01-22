import java.util.List;

public class xor {
    public int findKRotation(List<Integer> arr) {
        //number of times array rotated is equal to index of min element
        int n= arr.size();
        int low= 0;
        int high= n-1;
        int ans= Integer.MAX_VALUE;
        int index= -1;

        while(low<=high){
            int mid= low+(high-low)/2;
            //if search is already sorted 
            //then nums[low] will be smaller in that space
            if(arr.get(low)<=arr.get(high)){
                if(arr.get(low)<=ans){
                    ans= arr.get(low);
                    index= low;
                }
                break;
            }
            
            if(arr.get(low)<=arr.get(mid)){
                if(arr.get(low)<=ans){
                    ans= arr.get(low);
                    index= low;
                }
                low= mid+1;
            }
            else{
                if(arr.get(mid)<=ans){
                    ans= arr.get(mid);
                    index= mid;
                }
                high= mid-1;
            }
        }
    return index;
    }
    public static void main(String[] args) {
        int nums[]= {2,5,6,0,0,1,2};
        
        
    }
}
