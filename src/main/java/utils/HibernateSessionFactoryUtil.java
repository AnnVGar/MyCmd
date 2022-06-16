package utils;

import models.Author;
import models.Book;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {

    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                System.out.println("000");
                Configuration config = new Configuration().configure();
                System.out.println("1");
                config.addAnnotatedClass(Author.class);
                config.addAnnotatedClass(Book.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
                sessionFactory = config.buildSessionFactory(builder.build());

            } catch (Exception e) {
               e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
