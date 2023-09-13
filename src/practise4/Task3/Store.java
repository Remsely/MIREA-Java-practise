package practise4.Task3;

import java.util.*;

public class Store {
    private Map<Category, List<Product>> catalog;
    private List<User> users;

    public Store(){
        this.catalog = new HashMap<>();
        this.users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public void addProductToCatalog(Product product){
        Category category = product.getCategory();
        catalog.computeIfAbsent(category, k -> new ArrayList<>()).add(product);
    }

    public List<Product> getProductsInCategory(Category category){
        return catalog.getOrDefault(category, new ArrayList<>());
    }

    public void singIn(Scanner scanner){
        boolean success = false;
        while (!success){
            System.out.println("Введите логин: ");
            String login = scanner.nextLine();
            System.out.println("Введите пароль: ");
            String password = scanner.nextLine();
            for (User user : users){
                if(user.getLogin().equals(login) && user.getPassword().equals(password)){
                    success = true;
                    break;
                }
            }
            if (!success){
                System.out.println("Неверный логин или пароль, попробуйте снова!");
            }
        }
        System.out.println("Вы успешно Аавторизованы!\n");
    }

    public void displayCatalog(){
        System.out.println();
        int i = 1;
        for(Category category : Category.values()){
            System.out.println(i + ") " + category);
            displayCategory(category);
            System.out.println();
            i++;
        }
    }

    public void displayCategory(Category category){
        System.out.println("---------------------------------");
        List<Product> products = catalog.getOrDefault(category, new ArrayList<>());
        int j = 1;
        for (Product product : products){
            System.out.println(j + " - Наименование: " + product.getName() + "; Цена: " + product.getPrice());
            j++;
        }
    }

    public void addToBasket(Basket basket, Category category, int index){
        List<Product> products = catalog.getOrDefault(category, new ArrayList<>());
        basket.addProduct(products.get(index - 1));
        System.out.println("---------------------------------");
        System.out.println("Товар добавлен в корзину!");
    }
}
