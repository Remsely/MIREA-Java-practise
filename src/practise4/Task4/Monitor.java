package practise4.Task4;

public class Monitor {
    private final String model;
    private final double screenSize;
    private final String resolution;
    private final int refreshRate;

    public Monitor(String model, double screenSize, String resolution, int refreshRate){
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.refreshRate = refreshRate;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", resolution='" + resolution + '\'' +
                ", refreshRate=" + refreshRate +
                '}';
    }
}
