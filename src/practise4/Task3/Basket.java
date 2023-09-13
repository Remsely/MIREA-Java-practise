package practise4.Task3;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> products;

    public Basket(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void clearBasket(){
        products.clear();
        System.out.println("Спасибо за покупку! Теперь ваша корзина пуста!");
    }

    public void displayBasket(){
        System.out.println("Содержимое корзины: ");
        int i = 1;
        for (Product product : products){
            System.out.println(i + " - Наименование: " + product.getName() + "; Цена: " + product.getPrice());
            i++;
        }
        System.out.println("---------------------------------");
    }
}
