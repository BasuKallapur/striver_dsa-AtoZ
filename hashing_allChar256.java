import java.util.Scanner;

public class hashing_allChar256 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= "aaabbbb....sfdf";
        int l= str.length();

        //precompute
        int hash[]= new int[256];
        for(int i=0; i<l; i++){
            hash[str.charAt(i)]++;
        }

        //query
        System.out.println("how many query: ");
        int q= sc.nextInt();
        while (q-- !=0) {
            char qq= sc.next().charAt(0); // to convert from string to char
            System.out.println(hash[qq]);
        }
    }    
}
