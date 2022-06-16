import models.Author;
import models.Book;
import services.AuthorService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

//        AuthorService userService = new AuthorService();
//        Author author = new Author("Бунин","Иван");
//        userService.saveAuthor(author);
//        Book book = new Book("Кавказ");
//        author.addBook(book);
//        Book book2 = new Book("Цифры");
//        book2.setAuthor(author);
//        author.addBook(book2);
//        userService.updateUser(author);
        AuthorService userService = new AuthorService();

        Author author = userService.findAuthorById(3);
        System.out.println(author);


    }
}
