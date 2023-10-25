package practise24.Task3;

public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Текстовый документ открыт!");
    }

    @Override
    public void save() {
        System.out.println("Текстовый документ сохранен!");
    }
}
