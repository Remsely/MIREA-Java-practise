package practise4.Task2;

public enum ClothingSize {
    XXS(32), XS(34), S(36), M(38), L(40);
    private final int euroSize;

    private ClothingSize(int euroSize){
        this.euroSize = euroSize;
    }

    public String getDescription(){
        if (this == XXS)
            return "Детский размер";
        else
            return "Взрослый размер";
    }

    public int getEuroSize() {
        return euroSize;
    }
}
