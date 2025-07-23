public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "hello world";

        // 1. length()
        System.out.println(str.length()); // 11

        // 2. charAt(index)
        System.out.println(str.charAt(0)); // H

        // 3. substring(start, end)
        System.out.println(str.substring(0, 5)); // Hello

        // 4. contains()
        System.out.println(str.contains("World")); // true

        // 5. indexOf() / lastIndexOf()
        System.out.println(str.indexOf('o')); // 4
        System.out.println(str.lastIndexOf('o')); // 7

        // 6. equals() and equalsIgnoreCase()
        System.out.println(str.equals(str2)); // false
        System.out.println(str.equalsIgnoreCase(str2)); // true

        // 7. toLowerCase() / toUpperCase()
        System.out.println(str.toLowerCase()); // hello world
        System.out.println(str.toUpperCase()); // HELLO WORLD

        // 8. trim()
        String s = "  Java  ";
        System.out.println(s.trim()); // "Java"

        // 9. replace() / replaceAll()
        System.out.println(str.replace("World", "Java")); // Hello Java
        System.out.println(str.replaceAll("l", "x")); // Hexxo Worxd

        // 10. startsWith() / endsWith()
        System.out.println(str.startsWith("Hell")); // true
        System.out.println(str.endsWith("ld")); // true

        // 11. split()
        String[] words = str.split(" ");
        for (String w : words)
            System.out.print(w + " "); // Hello World

        // 12. isEmpty() / isBlank()
        String empty = "";
        String blank = "  ";
        System.out.println(empty.isEmpty()); // true
        System.out.println(blank.isBlank()); // true (Java 11+)

        // 13. compareTo() and compareToIgnoreCase()
        System.out.println("apple".compareTo("banana")); // -1 (lexical compare)
        System.out.println("apple".compareToIgnoreCase("Apple")); // 0

        // 14. valueOf()
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println(numStr); // "123"
    }
}
