package practise3.Shell_classes;

public class ShellClasses {
    public static void main(String[] args) {
        //1
        Double double1 = Double.valueOf("12.3232");
        Double double2 = Double.valueOf(12.3232);

        //2
        double double3 = Double.parseDouble("12.3232");
        System.out.println(double3);
        System.out.println();
        //3
        System.out.println("int: " + double1.intValue());
        System.out.println("double: " + double1);
        System.out.println("float: " + double1.floatValue());
        System.out.println("long: " + double1.longValue());
        System.out.println("short: " + double1.shortValue());
        System.out.println("byte: " + double1.byteValue());
        //4
        System.out.println("byte: " + double1.byteValue());
        //5
        System.out.println();
        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
