package practise4.Task4;

public class Computer {
    private final ComputerBrand computerBrand;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;

    public Computer(ComputerBrand computerBrand, Processor processor, Memory memory, Monitor monitor){
        this.computerBrand = computerBrand;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
    }

    public ComputerBrand getComputerBrand() {
        return computerBrand;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerBrand=" + computerBrand +
                ", processor=" + processor +
                ", memory=" + memory +
                ", monitor=" + monitor +
                '}';
    }
}
