package practise4_1.Task5;

public class Tester {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 12345, "Информатика", "01.01.1990", "+1234567890");

        reader1.takeBook(3);
        reader1.takeBook("Учебник по Java", "Как стать back-end разработчиком", "Энциклопедия по Java");
        Book book1 = new Book("Учебник по Java", "Литвинов И.И.");
        Book book2 = new Book("Как стать back-end разработчиком", "Литвинов И.И.");
        Book book3 = new Book("Энциклопедия по Java", "Oracle");
        reader1.takeBook(book1, book2, book3);

        reader1.returnBook(2);
        reader1.returnBook("Учебник по Java", "Как стать back-end разработчиком");
        reader1.returnBook(book1, book3);
    }
}
