package practise4_1.Task5;

import javax.crypto.spec.PSource;

public class Reader {
    private String fullName;
    private int readerID;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int readerID, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.readerID = readerID;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count){
        System.out.println(fullName + " влял " + count + " книг");
    }

    public void takeBook(String... bookTitles){
        System.out.println(fullName + " взял книги: ");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.print(bookTitles[i]);
            if(i < bookTitles.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        System.out.println();
    }

    public void takeBook(Book... books){
        System.out.println(fullName + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle());
            if(i < books.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        System.out.println();
    }

    public  void returnBook(int count){
        System.out.println(fullName + " вернул " + count + " книг");
    }

    public void returnBook(String... bookTitles){
        System.out.println(fullName + " вернул книги: ");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.print(bookTitles[i]);
            if(i < bookTitles.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        System.out.println();
    }

    public void returnBook(Book... books){
        System.out.println(fullName + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle());
            if(i < books.length - 1)
                System.out.print(", ");
        }
        System.out.println();
        System.out.println();
    }
}
