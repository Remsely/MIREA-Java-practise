package practise2.Task6;

public class CircleTest {
    private static void printCircleMetrics(Circle circle1, Circle circle2) {
        System.out.println("Радиус 1 круга = " + circle1.getRadius());
        System.out.println("Площадь 1 крага: " + circle1.calculateArea());
        System.out.println("Длина окружности 1 круга: " + circle1.calculateCircumferenceLength());
        System.out.println();

        System.out.println("Радиус 2 круга = " + circle2.getRadius());
        System.out.println("Площадь 2 крага: " + circle2.calculateArea());
        System.out.println("Длина окружности 2 круга: " + circle2.calculateCircumferenceLength());
        System.out.println();
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);

        printCircleMetrics(circle1, circle2);

        circle1.setRadius(4.0);
        circle2.setRadius(8.0);

        printCircleMetrics(circle1, circle2);
    }
}
