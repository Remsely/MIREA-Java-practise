package practise24.Task2;

public class Test {
    public static void main(String[] args) {
        // Создаем фабрику стульев
        AbstractChairFactory chairFactory = new ChairFactory();

        // Создаем клиента
        Client client = new Client();

        // Используем абстрактную фабрику для создания стульев разных типов
        VictorianChair victorianChair = chairFactory.createVictorianChair();
        MagicChair magicChair = chairFactory.createMagicChair();
        FunctionalChair functionalChair = chairFactory.createFunctionalChair();

        // Передаем стулья клиента для тестирования
        client.setChair(victorianChair);
        client.sit();

        client.setChair(magicChair);
        client.sit();

        client.setChair(functionalChair);
        client.sit();

        // Работу стульев
        System.out.println("Victorian Chair Age: " + victorianChair.getAge());
        magicChair.doMagic();
        System.out.println("Sum Result: " + functionalChair.sum(2, 5));
    }
}
