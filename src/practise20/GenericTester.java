package practise20;

public class GenericTester {
    public static void main(String[] args) {
        GenericClass<Integer, Double, String> genericClass = new GenericClass<Integer, Double, String>(25, 2.5, "I'm generic");
        System.out.println(genericClass);
    }
}
