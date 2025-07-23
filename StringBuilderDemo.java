public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append()
        sb.append(" World");
        System.out.println(sb); // Hello World

        // 2. insert(index, str)
        sb.insert(5, ",");
        System.out.println(sb); // Hello, World

        // 3. delete(start, end)
        sb.delete(5, 6);
        System.out.println(sb); // Hello World

        // 4. reverse()
        sb.reverse();
        System.out.println(sb); // dlroW olleH

        // 5. setCharAt(index, ch)
        sb.setCharAt(0, 'D');
        System.out.println(sb); // DlroW olleH

        // 6. toString()
        String s = sb.toString(); // convert back to normal string
        System.out.println(s);
    }
}
