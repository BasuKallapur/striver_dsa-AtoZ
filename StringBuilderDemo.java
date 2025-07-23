public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append() - adds text at the end
        sb.append(" World");
        System.out.println(sb); // Hello World

        // 2. insert(index, str) - inserts string at specified index
        sb.insert(5, ",");
        System.out.println(sb); // Hello, World

        // 3. delete(start, end) - deletes characters from start to end-1
        sb.delete(5, 6);
        System.out.println(sb); // Hello World

        // 4. reverse() - reverses the characters in the StringBuilder
        sb.reverse();
        System.out.println(sb); // dlroW olleH

        // 5. setCharAt(index, ch) - sets a character at given index
        sb.setCharAt(0, 'D');
        System.out.println(sb); // DlroW olleH

        // 6. toString() - converts StringBuilder to normal String
        String s = sb.toString();
        System.out.println(s); // DlroW olleH
    }
}
