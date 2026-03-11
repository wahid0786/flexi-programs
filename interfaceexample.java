
interface Shape {

    void draw();

}

class circle implements Shape {

    public void draw() {
        System.out.println("This is a circle");
    }
}

public class interfaceexample {

    public static void main(String[] args) {
        Shape s = new circle();
        s.draw();
    }

}
