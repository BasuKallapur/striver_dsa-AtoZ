public class Lexicographically_smallest_string {
    public static String getRes(String res) {
        String ans = "";
        int n = res.length();
        int idx = n - 1;
        for (int i = 0; i <= n - 2; i++) {
            if (res.charAt(i) > res.charAt(i + 1)) {
                idx = i;
            }
        }
        for (int i = 0; i <= n - 1; i++) {
            if (i != idx) {
                ans+= res.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aaa";
        String res = getRes(str);
        System.out.println("ans is: " + res);
    }
}
