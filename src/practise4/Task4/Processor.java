package practise4.Task4;

public class Processor {
    private final String model;
    private final double clockSpeed;

    public Processor(String model, double clockSpeed){
        this.clockSpeed = clockSpeed;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "model='" + model + '\'' +
                ", clockSpeed=" + clockSpeed +
                '}';
    }
}
