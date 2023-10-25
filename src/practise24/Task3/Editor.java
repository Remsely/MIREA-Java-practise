package practise24.Task3;

public class Editor {
    private IDocument document;
    private final ICreateDocument documentFactory;

    public Editor(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
    }

    public void createNewDocument() {
        document = documentFactory.createNew();
        System.out.println("Документ создан");
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        System.out.println("Существующий документ открыт");
    }

    public void saveDocument() {
        document.save();
        System.out.println("Документ сохранен");
    }
}
