
import java.io.IOException;

class ThrowExample {

    static void fun() {
        try {
            throw new NullPointerException("Demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }

    static void hello() throws IOException {
        System.out.println("hello world");

    }

    public static void main(String[] args) {
        try {
            fun();
        } catch (NullPointerException e) {
            System.out.println("Caught in throwexample().");
        }

        try {
            hello();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
