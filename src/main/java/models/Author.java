package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "public.authors")

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "surname")
    private String surname;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Book> books;

    public Author() {
    }

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        book.setAuthor(this);
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "models.Author{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name=" + name +
                '}';
    }

}
