package practise4.Task4;

public class Tester {
    public static void main(String[] args) {
        Processor processor1 = new Processor("Intel Core i7", 3.5);
        Memory memory1 = new Memory(16, "DDR4");
        Monitor monitor1 = new Monitor("Samsung Odyssey G5", 27, "2560x1440", 165);
        Computer computer1 = new Computer(ComputerBrand.Samsung, processor1, memory1, monitor1);

        Processor processor2 = new Processor("AMD Ryzen 5", 3.2);
        Memory memory2 = new Memory(8, "DDR4");
        Monitor monitor2 = new Monitor("HUAWEI MateView GT", 34, "3440x1440", 165);
        Computer computer2 = new Computer(ComputerBrand.Huawei, processor2, memory2, monitor2);

        Processor processor3 = new Processor("Intel Core i5", 2.8);
        Memory memory3 = new Memory(32, "DDR3");
        Monitor monitor3 = new Monitor("GIGABYTE M27Q X", 27, "2560x1440", 240);
        Computer computer3 = new Computer(ComputerBrand.Asus, processor3, memory3, monitor3);

        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);
    }
}
