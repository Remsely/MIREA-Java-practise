package practise2.Task3;

public class Tester {
    private static Circle[] circles;
    private static int numberOfCircles;

    public static void main(String[] args) {
        numberOfCircles = 3;
        circles = new Circle[numberOfCircles];
        circles[0] = new Circle(1.0, 2.0, 3.0);
        circles[1] = new Circle(2.0, 3.0, 5.0);
        circles[2] = new Circle(3.0, 1.0, 5.0);
        for (Circle c : circles){
            System.out.println(c);
        }
    }
}
