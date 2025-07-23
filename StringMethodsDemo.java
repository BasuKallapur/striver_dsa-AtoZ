public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "hello world";

        // 1. length() - returns the number of characters in the string
        System.out.println(str.length()); // 11

        // 2. charAt(index) - returns the character at the specified index
        System.out.println(str.charAt(0)); // H

        // 3. substring(start, end) - returns substring from start to end-1
        System.out.println(str.substring(0, 5)); // Hello

        // 4. contains() - checks if the string contains a given sequence
        System.out.println(str.contains("World")); // true

        // 5. indexOf() / lastIndexOf() - returns index of first/last occurrence of char
        System.out.println(str.indexOf('o')); // 4
        System.out.println(str.lastIndexOf('o')); // 7

        // 6. equals() - checks exact equality (case-sensitive)
        //    equalsIgnoreCase() - checks equality ignoring case
        System.out.println(str.equals(str2)); // false
        System.out.println(str.equalsIgnoreCase(str2)); // true

        // 7. toLowerCase() / toUpperCase() - converts to lower/upper case
        System.out.println(str.toLowerCase()); // hello world
        System.out.println(str.toUpperCase()); // HELLO WORLD

        // 8. trim() - removes leading and trailing whitespace
        String s = "  Java  ";
        System.out.println(s.trim()); // "Java"

        // 9. replace() - replaces old sequence with new one
        //    replaceAll() - replaces all matches of regex with replacement
        System.out.println(str.replace("World", "Java")); // Hello Java
        System.out.println(str.replaceAll("l", "x")); // Hexxo Worxd

        // 10. startsWith() / endsWith() - checks if string starts/ends with a sequence
        System.out.println(str.startsWith("Hell")); // true
        System.out.println(str.endsWith("ld")); // true

        // 11. split() - splits string based on delimiter (regex)
        String[] words = str.split(" ");
        for (String w : words)
            System.out.print(w + " "); // Hello World

        // 12. isEmpty() - checks if string has 0 length
        //     isBlank() - checks if string is empty or only whitespace (Java 11+)
        String empty = "";
        String blank = "  ";
        System.out.println(empty.isEmpty()); // true
        System.out.println(blank.isBlank()); // true

        // 13. compareTo() - compares strings lexicographically
        //     compareToIgnoreCase() - ignores case while comparing
        System.out.println("apple".compareTo("banana")); // -1
        System.out.println("apple".compareToIgnoreCase("Apple")); // 0

        // 14. valueOf() - converts other data types to string
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println(numStr); // "123"
    }
}
