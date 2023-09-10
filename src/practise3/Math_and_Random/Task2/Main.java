package practise3.Math_and_Random.Task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int circlesCount = random.nextInt(1, 10);
        Tester tester = new Tester(circlesCount);

        for (int i = 0; i < circlesCount; i++){
            tester.addCircle(new Circle(new Point(random.nextDouble() * 10, random.nextDouble() * 10)));
        }

        System.out.println("Окружности: ");
        System.out.println(tester);
        System.out.println();

        System.out.println("Самая маленькая окружность: " + tester.findSmallestCircle().getRadius());
        System.out.println("Самая большая окружность: " + tester.findLargestCircle().getRadius());

        tester.sortCirclesByRadius();

        System.out.println();
        System.out.println("Окружности после сортировки:");
        System.out.println(tester);
    }
}
