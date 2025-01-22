public class something {
    public static String reverseWords(String s) {
        // Step 1: Convert the string to a character array for in-place modification
        char[] str = s.toCharArray();
        int n = str.length;

        // Step 2: Trim leading and trailing spaces and reduce multiple spaces
        int len = cleanSpaces(str, n);
        
        // Step 3: Reverse the entire cleaned string
        reverse(str, 0, len - 1);
        
        // Step 4: Reverse each word within the string
        int start = 0;
        for (int end = 0; end < len; end++) {
            if (str[end] == ' ') {
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
        // Reverse the last word
        reverse(str, start, len - 1);
        
        // Return the final result as a new string
        return new String(str, 0, len);
    }

    // Helper function to reverse characters between two indices
    private static void reverse(char[] str, int left, int right) {
        while (left < right) {
            char temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
    }

    // Helper function to trim spaces and reduce multiple spaces to one
    private static int cleanSpaces(char[] str, int n) {
        int i = 0, j = 0;
        while (j < n) {
            // Skip leading spaces
            while (j < n && str[j] == ' ') j++;
            // Copy non-space characters
            while (j < n && str[j] != ' ') str[i++] = str[j++];
            // Skip trailing spaces, but keep one space between words
            while (j < n && str[j] == ' ') j++;
            if (j < n) str[i++] = ' ';  // Add space between words
        }
        return i;
    }
    public static void main(String[] args) {
        String str= "   Hello   World   ";
        String ans= reverseWords(str);
        System.out.println(ans.length());
        System.out.println(ans);
    }
}
