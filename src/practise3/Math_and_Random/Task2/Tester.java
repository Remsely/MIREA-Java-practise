package practise3.Math_and_Random.Task2;

import java.util.Arrays;

public class Tester {
    private final Circle[] circles;
    private int circlesCount;

    public Tester(int maxLength){
        circles = new Circle[maxLength];
        circlesCount = 0;
    }

    public void addCircle(Circle circle){
        if(circlesCount < circles.length){
            circles[circlesCount] = circle;
            circlesCount++;
        }
    }

    public Circle findSmallestCircle(){
        if(circlesCount == 0){
            return null;
        }

        Circle smallestCircle = circles[0];
        for (int i = 1; i < circlesCount; i++){
            if(circles[i].getRadius() < smallestCircle.getRadius()){
                smallestCircle = circles[i];
            }
        }
        return smallestCircle;
    }

    public Circle findLargestCircle(){
        if(circlesCount == 0){
            return null;
        }

        Circle largestCircle = circles[0];
        for (int i = 1; i < circlesCount; i++){
            if(circles[i].getRadius() > largestCircle.getRadius()){
                largestCircle = circles[i];
            }
        }
        return largestCircle;
    }

    public void sortCirclesByRadius() {
        for(int i = 0; i < circlesCount - 1; i++){
            for (int j = 0; j < circlesCount - 1 - i; j++){
                if(circles[j].getRadius() > circles[j + 1].getRadius()){
                    Circle c = circles[j];
                    circles[j] = circles[j + 1];
                    circles[j + 1] = c;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Tester{" +
                "circles=" + Arrays.toString(circles) +
                ", circlesCount=" + circlesCount +
                '}';
    }
}
