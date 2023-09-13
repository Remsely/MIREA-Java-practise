package practise4.Task4;

public class Memory {
    private final int size;
    private final String type;

    public Memory(int size, String type){
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
