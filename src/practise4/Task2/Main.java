package practise4.Task2;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(ClothingSize.L, 20.0, "Белый"),
                new TShirt(ClothingSize.XXS, 35.0, "Синий"),
                new Pants(ClothingSize.M, 300.0, "Черный"),
                new Skirt(ClothingSize.S, 245.0, "Красный"),
                new Tie(ClothingSize.XS, 103.0, "Желтый")
        };

        Atelier.dressMen(clothes);
        Atelier.dressWomen(clothes);
    }
}
