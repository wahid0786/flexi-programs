
public class NestedTryExample {

    public static void main(String[] args) {
        try {
            System.out.println("Outer try block started.");
            try {
                System.out.println("Inner try block started.");
                int result = 10 / 0; // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Error: ArithmeticException! Cannot divide by zero.");
            }
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException

        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in outer try block." + e.getMessage());
        } finally {
            System.out.println("Outer try block ended.");
        }

        System.out.println("Program continues after nested try-catch blocks.");
    }

}
