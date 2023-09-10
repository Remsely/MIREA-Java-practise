package practise2.Task7;

public class BookTest {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(5);

        shelf.addBook(new Book("Книга 1", "Автор 1", 2023));
        shelf.addBook(new Book("Книга 2", "Автор 2", 2015));
        shelf.addBook(new Book("Книга 3", "Автор 3", 1999));
        shelf.addBook(new Book("Книга 4", "Автор 4", 2004));
        shelf.addBook(new Book("Книга 5", "Автор 5", 2010));

        System.out.println();
        System.out.println("Книжная полка до сортировки: " + shelf);
        shelf.sortBooksByYear();
        System.out.println("Книжная полка после сортировки: " + shelf);

        System.out.println();
        System.out.println("Самая ранняя книга: " + shelf.getEarliestBook());
        System.out.println("Самая ранняя книга: " + shelf.getLatestBook());
    }
}
