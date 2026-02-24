
class Exception {

    static void fun() {
        try {
            throw new NullPointerException("Demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }

    public static void throwexample() {
        try {
            fun();
        } catch (NullPointerException e) {
            System.out.println("Caught in throwexample().");
        }
    }
}
