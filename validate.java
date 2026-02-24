
class InvalidAgeException extends java.lang.Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class validate {

    public static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18 to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            validate(12);
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
