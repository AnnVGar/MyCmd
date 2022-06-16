package services;

import dao.AuthorDao;
import models.Author;
import models.Book;

import java.util.List;

public class AuthorService {

    private AuthorDao authorDao = new AuthorDao();

    public AuthorService() {
    }

    public Author findAuthorById(int id) {
        return authorDao.findById(id);
    }

    public void saveAuthor(Author author) {
        authorDao.save(author);
    }

    public void deleteAuthor(Author author) {
        authorDao.delete(author);
    }

    public void updateAuthor(Author author) {
        authorDao.update(author);
    }

    public List<Author> findAllAuthors() {
        return authorDao.findAll();
    }

    public Book findBookById(int id) {
        return authorDao.findBookById(id);
    }


}
