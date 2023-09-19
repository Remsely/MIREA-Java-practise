package practise4_1.Task1_8andEx1;

public class Tester {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "Black", true);
        Shape rectangle = new Rectangle(4.0, 6.0, "Blue", false);
        Shape square = new Square(3.0, "Red", true);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
