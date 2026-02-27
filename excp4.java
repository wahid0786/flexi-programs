
import java.io.IOException;

class Parent {

    void readFile() throws IOException {
        System.out.println("Reading File in Parent");
    }
}

class Child extends Parent {

    @Override
    void readFile() throws IOException {
        System.out.println("Reading File in Child");

    }
}

public class excp4 {

    public static void main(String[] args) {
        Parent p = new Child();
        try {
            p.readFile();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

}
