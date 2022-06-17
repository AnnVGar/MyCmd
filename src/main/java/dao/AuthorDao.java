package dao;


import models.Author;
import models.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;
import java.util.List;

public class AuthorDao {

    public Author findById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Author author =  session.get(Author.class, id);
        session.close();
        System.out.println(session);
        return author;


    }

    public void save(Author author) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(author);
        tx1.commit();
        session.close();
    }

    public void update(Author author) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(author);
        tx1.commit();
        session.close();
    }

    public void delete(Author author) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(author);
        tx1.commit();
        session.close();
    }

    public Book findBookById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Book book = session.get(Book.class, id);
        session.close();
        return book;
    }

    public List<Author> findAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Author> authors = (List<Author>)  session.createQuery("From Author").list();

        return authors;

    }
}
