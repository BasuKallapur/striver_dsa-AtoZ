import java.util.Arrays;

public class lengthOfLastWord {
    public static void main(String[] args) {
        // String str = "    basu    kallapur  c bmscce";
        // System.out.println(str);
        // System.out.println();
        // str = str.strip(); // Removes leading and trailing white spaces from the string.
        // System.out.println(str);
        
        String s = "   fly me   to   the moon  ";
        String str[] = s.strip().split("\\s+");
        System.out.println(Arrays.toString(str));
    }
}
