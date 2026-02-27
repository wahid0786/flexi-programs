
import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {

    void readFile() throws IOException {
        System.out.println("Reading file in Parent");
    }
}

class Child extends Parent {

    @Override
    void readFile() throws FileNotFoundException {
        System.out.println("File not found in Child");
    }
}

public class excp5 {

    public static void main(String[] args) {
        Parent p = new Child();
        try {
            p.readFile();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
