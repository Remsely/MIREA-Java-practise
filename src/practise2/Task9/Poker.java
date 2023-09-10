package practise2.Task9;

import java.util.*;

public class Poker {
    private static List<String> createShuffledDeck(){
        List<String> deck = new ArrayList<>();
        String[] suits = {"Пики", "Черви", "Бубны", "Крести"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for(String suit : suits){
            for(String value : values){
                deck.add(value + " " + suit);
            }
        }

        Collections.shuffle(deck);
        return deck;
    }

    private static void dealCards(List<String> deck, int numberOfPlayers){
        int cardsPerPlayer = 5;

        if(numberOfPlayers * cardsPerPlayer > deck.size()){
            System.out.println("Недостаточно карт в колоде для раздачи.");
            return;
        }

        for (int i = 0; i < numberOfPlayers; i++){
            System.out.println("Игрок " + (i + 1) + ": ");
            for (int j = 0; j < cardsPerPlayer; j++){
                System.out.println(deck.get(0));
                deck.remove(0);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Введите количество игроков: ");
        int numberOfPlayers = in.nextInt();

        List<String> deck = createShuffledDeck();

        dealCards(deck, numberOfPlayers);
    }
}
