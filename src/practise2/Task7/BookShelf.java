package practise2.Task7;

import java.util.Arrays;

public class BookShelf {
    private Book[] books;
    private int bookCount;

    public BookShelf(int maxBooks){
        books = new Book[maxBooks];
        bookCount = 0;
    }

    public void addBook(Book book){
        if(bookCount < books.length){
            books[bookCount] = book;
            bookCount++;
        }
        else {
            System.out.println("Книжная полка заполнена! ");
        }
    }

    public Book getEarliestBook(){
        if(bookCount == 0)
            return null;

        Book earliestBook = books[0];
        for(int i = 1; i < bookCount; i++){
            if(books[i].getYear() < earliestBook.getYear()){
                earliestBook = books[i];
            }
        }
        return earliestBook;
    }

    public Book getLatestBook(){
        if(bookCount == 0)
            return null;

        Book latestBook = books[0];
        for(int i = 1; i < bookCount; i++){
            if(books[i].getYear() > latestBook.getYear()){
                latestBook = books[i];
            }
        }
        return latestBook;
    }

    public void sortBooksByYear(){
        for(int i = 0; i < bookCount - 1; i++){
            for (int j = 0; j < bookCount - 1 - i; j++){
                if(books[j].getYear() > books[j + 1].getYear()){
                    Book b = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = b;
                }
            }
        }
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + Arrays.toString(books) +
                ", bookCount=" + bookCount +
                '}';
    }
}
