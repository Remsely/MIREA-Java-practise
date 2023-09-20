package practise7.Task4;

public class MathFunc implements MathCalculable{
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexAbsolute(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double calculateCircleLength(double radius){
        return 2 * MathCalculable.PI * radius;
    }

    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        System.out.println(mathFunc.power(2, 3));
        System.out.println(mathFunc.complexAbsolute(3, 4));
        System.out.println(mathFunc.calculateCircleLength(5));
    }
}
