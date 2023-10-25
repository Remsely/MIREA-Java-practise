package practise24.Task2;

public class Client {
    public Chair chair;

    public void sit() {
        System.out.println("Client sit on chair" + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
