
import java.util.Vector;

public class vectorexample {

    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        System.out.println("Vector: " + numbers);
        numbers.remove(1);
        System.out.println("Vector after removal: " + numbers);

        System.out.println("Size of vector: " + numbers.size());
        System.out.println("Is the vector empty? " + numbers.get(0));

    }

}
