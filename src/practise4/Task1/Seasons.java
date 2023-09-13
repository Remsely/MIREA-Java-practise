package practise4.Task1;

public class Seasons {
    public static void printSeasonDescription(Season season) {
        switch (season) {
            case ЛЕТО -> System.out.println("Я люблю лето!");
            case ВЕСНА -> System.out.println("Я люблю весну!");
            case ОСЕНЬ -> System.out.println("Я люблю осень!");
            case ЗИМА -> System.out.println("Я люблю зиму!");
        }
    }
    public static void main(String[] args) {
        Season favouriteSeason = Season.ЛЕТО;
        System.out.println("Информация о любимом времени года: ");
        favouriteSeason.printInfo();

        printSeasonDescription(Season.ЛЕТО);
        printSeasonDescription(Season.ВЕСНА);
        printSeasonDescription(Season.ОСЕНЬ);
        printSeasonDescription(Season.ЗИМА);
    }
}
