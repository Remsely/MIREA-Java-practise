package practise4.Task1;

public enum Season {
    ВЕСНА("весна", 10.5),
    ЛЕТО("лето", 20.5),
    ОСЕНЬ("осень", 10.5),
    ЗИМА("зима", 0.5);

    private String description;
    private double avgTemp;

    private Season(String description, double avgTemp){
        this.description = description;
        this.avgTemp = avgTemp;
    }

    public String getDescription(){
        if(this == ЛЕТО)
            return "теплое время года";
        else
            return "холодное время года";
    }

    public void printInfo() {
        System.out.println("Время года: " + this + "; Описание: " + description + "; Средняя температура: " + avgTemp);
    }
}
