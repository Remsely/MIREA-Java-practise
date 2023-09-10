package practise2.Task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        System.out.println(ball1.getX());
        System.out.println(ball1.getY());
        ball1.setX(1.0);
        System.out.println(ball1.getX());
        ball1.setY(-1.5);
        System.out.println(ball1.getY());
        ball1.setXY(5.0, -3.5);
        System.out.println(ball1);
        ball1.move(5.0, 5.0);
        System.out.println(ball1);

        Ball ball2 = new Ball(2.0, 2.0);
        System.out.println(ball2.getY());
        System.out.println(ball2.getX());
        ball2.setXY(-7.0, 3.5);
        System.out.println(ball2);
        ball2.move(2.0, 7.0);
        System.out.println(ball2);
    }
}
