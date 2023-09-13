package practise4.Task2;

public class Atelier {
    public static void dressMen(Clothes[] clothes){
        System.out.println();
        System.out.println("Мужская одежда: ");
        for (Clothes c : clothes){
            if (c instanceof MenClosing closing){
                System.out.println("Размер: " + c.getSize() + "; Стоимость: " + c.getCost() + "; Цвет: " + c.getColor());
                closing.dressMan();
            }
        }
    }

    public static void dressWomen(Clothes[] clothes){
        System.out.println();
        System.out.println("Женская одежда: ");
        for (Clothes c : clothes){
            if (c instanceof WomenClosing closing){
                System.out.println("Размер: " + c.getSize() + "; Стоимость: " + c.getCost() + "; Цвет: " + c.getColor());
                closing.dressWomen();
            }
        }
    }
}
