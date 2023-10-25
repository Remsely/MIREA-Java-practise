package practise24.Task3;

import java.util.Scanner;

public class TextEditorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип документа: (1) TextDocument");
        int choice = scanner.nextInt();
        ICreateDocument documentFactory;

        if (choice == 1) {
            documentFactory = new CreateTextDocument();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        Editor editor = new Editor(documentFactory);

        while (true) {
            System.out.println("Выберите пункт меню: (1) New, (2) Open, (3) Save, (4) Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> editor.createNewDocument();
                case 2 -> editor.openDocument();
                case 3 -> editor.saveDocument();
                case 4 -> {
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
