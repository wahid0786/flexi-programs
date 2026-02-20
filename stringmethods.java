
public class stringmethods {

    public static void main(String[] args) {

        String str = "Hello, World!";

        System.out.println("Length: " + str.length());

        System.out.println("Uppercase: " + str.toUpperCase());

        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println("Contains 'World': " + str.contains("World"));

        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        System.out.println("Substring from index 7: " + str.substring(7));

        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));

        System.out.println("Replaced World with class:" + str.replace("World", "class"));

        System.out.println("Trimmed: " + str.trim());

        System.out.println("Concatenated with ' Welcome!': " + str.concat(" Welcome!"));
    }

}
