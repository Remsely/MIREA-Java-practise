package practise2.Task4;

public class Computer {
    private String model;

    public Computer(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                '}';
    }
}
