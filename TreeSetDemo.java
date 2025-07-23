import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // TreeSet<Integer> ts = new java.util.TreeSet<>();
        // ts.add(5);
        // ts.add(6);
        // ts.add(10);
        // ts.add(9);
        // ts.add(8);
        // ts.add(7);
        // System.out.println(ts);

        // // remove method
        // ts.remove(10);
        // System.out.println(ts);

        // // contains method
        // System.out.println(ts.contains(105));

        // // lower(x) gives greatest element less than x
        // System.out.println("original now: before lower " + ts);
        // System.out.println(ts.lower(6));

        // // floor(x) gives greatest element less than or equal to x
        // System.out.println("original now: before floor " + ts);
        // System.out.println(ts.floor(6));

        // // higher(x) gives greatest element greater than  x
        // System.out.println("original now: before higher " + ts);
        // System.out.println(ts.higher(6));

        // // ceiling(x) gives greatest element greater than or equal to x
        // System.out.println("original now: before ceiling " + ts);
        // System.out.println(ts.ceiling(6));

        // // first value
        // System.out.println("first value: " + ts.first());
        // // last value
        // System.out.println("last value: " + ts.last());


        // int arr[] = { 10, 20, 30, 9 };
        // TreeSet<Integer> ts2 = new TreeSet<>();
        // for (int num : arr) {
        //     ts2.add(num);
        // }
        // System.out.println(ts2.lower(arr[0]));


        int arr[] = { 2, 3, 4, 5, 1 };
        int n = arr.length;
        int[] res = new int[n];
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            Integer lower = set.lower(arr[i]);
            System.out.println("lower at this stage i= " + i + "is : " + lower);
            res[i] = (lower != null) ? lower : -1;
            set.add(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
    }
}
