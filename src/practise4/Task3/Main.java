package practise4.Task3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static void printMenu(){
        System.out.println("---------------------------------");
        System.out.println("Выберите действие: ");
        System.out.println("1 - Посмотреть католог товаров;");
        System.out.println("2 - Посмотреть категорию товаров;");
        System.out.println("3 - Добавить товар в корзину;");
        System.out.println("4 - Купить товары из корзины;");
        System.out.println("0 - Выйти");
        System.out.println("---------------------------------");
    }

    private static void printCategoryMenu(){
        System.out.println("Выберите категорию товаров: ");
        System.out.println("1 - ОДЕЖДА");
        System.out.println("2 - ЭЛЕКТРОНИКА");
        System.out.println("3 - ПРОДУКТЫ");
        System.out.println("---------------------------------");
    }

    private static void fillInCatalog(Store store){
        store.addProductToCatalog(new Product("Футболка", 2000, Category.ОДЕЖДА));
        store.addProductToCatalog(new Product("Штаны", 1500, Category.ОДЕЖДА));
        store.addProductToCatalog(new Product("Шорты", 1800, Category.ОДЕЖДА));
        store.addProductToCatalog(new Product("Трусы", 2000, Category.ОДЕЖДА));

        store.addProductToCatalog(new Product("Ноутбук", 80000, Category.ЭЛЕКТРОНИКА));
        store.addProductToCatalog(new Product("Смартфон", 50000, Category.ЭЛЕКТРОНИКА));
        store.addProductToCatalog(new Product("Часы", 30000, Category.ЭЛЕКТРОНИКА));
        store.addProductToCatalog(new Product("Телевизор", 100000, Category.ЭЛЕКТРОНИКА));

        store.addProductToCatalog(new Product("Макароны", 300, Category.ПРОДУКТЫ));
        store.addProductToCatalog(new Product("Курица", 250, Category.ПРОДУКТЫ));
        store.addProductToCatalog(new Product("Сосиски", 270, Category.ПРОДУКТЫ));
        store.addProductToCatalog(new Product("Мороженое", 80, Category.ПРОДУКТЫ));
    }

    private static void fillInUsers(Store store){
        store.addUser(new User("user1", "1234"));
        store.addUser(new User("user2", "4321"));
        store.addUser(new User("user3", "qwerty"));
    }

    private static void printCategory(Scanner scanner, Store store){
        System.out.println("Введите номер категории: ");
        int categoryChoice = scanner.nextInt();

        if(categoryChoice == 1){
            System.out.println("Товары в категории ОДЕЖДА: ");
            store.displayCategory(Category.ОДЕЖДА);
        } else if (categoryChoice == 2) {
            System.out.println("Товары в категории ЭЛЕКТРОНИКА: ");
            store.displayCategory(Category.ЭЛЕКТРОНИКА);
        } else if (categoryChoice == 3) {
            System.out.println("Товары в категории ПРОДУКТЫ: ");
            store.displayCategory(Category.ПРОДУКТЫ);
        }
    }

    private static void addToBasket(Store store,Basket basket, Scanner scanner){
        System.out.println("Введите номер категории: ");
        int categoryChoice = scanner.nextInt();
        System.out.println("Введите номер товара: ");
        int productChoice = scanner.nextInt();

        if(categoryChoice == 1){
            store.addToBasket(basket, Category.ОДЕЖДА, productChoice);
        } else if (categoryChoice == 2) {
            store.addToBasket(basket, Category.ЭЛЕКТРОНИКА, productChoice);
        } else if (categoryChoice == 3) {
            store.addToBasket(basket, Category.ПРОДУКТЫ, productChoice);
        }
    }

    public static void main(String[] args) {
        Store store = new Store();
        fillInCatalog(store);
        fillInUsers(store);

        Basket basket = new Basket();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        store.singIn(scanner);

        boolean isWorking = true;
        while (isWorking){
            printMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 0 -> isWorking = false;
                case 1 -> store.displayCatalog();
                case 2 -> printCategory(scanner, store);
                case 3 -> addToBasket(store, basket, scanner);
                case 4 -> {
                    basket.displayBasket();
                    basket.clearBasket();
                }
            }
        }
    }
}
