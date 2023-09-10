package practise2.Task1;

import java.util.Locale;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        String name = "Иван";
        String mail = "ivanovivan@mail.com";
        char gender = 'm';

        Author author = new Author(name, mail, gender);
        System.out.println(author.getName());
        System.out.println(author.getGender());
        System.out.println(author.getEmail());
        author.setEmail("iuwehpivuwp@jees.gf");
        System.out.println(author.getEmail());
        System.out.println(author);
    }
}
