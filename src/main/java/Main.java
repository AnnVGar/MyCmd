import models.Author;
import models.Book;
import services.AuthorService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {


        AuthorService authorService = new AuthorService();

//        Author author3 = userService.findAuthorById(3);
//        System.out.println(author3);
//        Author author = new Author("Бунин","Иван");
//        userService.saveAuthor(author);
//        Book book = new Book("Кавказ");
//        author.addBook(book);
//        Book book2 = new Book("Цифры");
//        book2.setAuthor(author);
//        author.addBook(book2);
//        userService.updateAuthor(author);

        List<Author> authors = authorService.findAllAuthors();
        System.out.println(authors);
//
//
    }
}
