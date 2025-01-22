import java.util.Scanner;

public class hashing_lowercase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= "abbcccddddeeeee";
        int l= str.length();

        //precompute
        int hash[]= new int[26];
        for(int i=0; i<l; i++){
            hash[str.charAt(i)- 'a']++;
        }

        //query
        System.out.println("how many query: ");
        int q= sc.nextInt();
        while (q-- !=0) {
            char qq= sc.next().charAt(0); // to convert from string to char
            System.out.println(hash[qq-'a']);
        }
    }
}
