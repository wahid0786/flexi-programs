
public class arraylistexample {

    public static void main(String[] args) {

        java.util.ArrayList<String> fruits = new java.util.ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits: " + fruits);
        fruits.remove("Banana");
        System.out.println("Fruits after removal: " + fruits);

        System.out.println("Size of fruits list: " + fruits.size());
        System.out.println("Is the fruits list empty? " + fruits.isEmpty());

    }

}
