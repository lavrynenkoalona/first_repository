package L16HW15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Author {
    //1. Create the following classes:
    //a. Author with fields:
    //i. String name
    //ii. short age
     //iii. List<Book> books
    String name;
    short age;
    List<Book> books;

    Author (String name, short age){
        this.name=name;
        this.age=age;
        this.books = new ArrayList<>();
    }

    Author (String name){
        this.name=name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        books.add(book);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", books=" + books.stream().map(book -> book.title).collect(Collectors.joining()) +
                '}';
    }
}
