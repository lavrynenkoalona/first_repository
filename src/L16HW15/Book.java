package L16HW15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Book {
    //1. Create the following classes:
    //b. Book with fields
      //i. String title
      //ii. List<Author> authors
    //iii. int numberOfPages
    String title;
    int numberOfPages;
    List<Author> authors;

    Book(String name, int numberOfPages) {
        this.title = name;
        this.numberOfPages = numberOfPages;
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author)
    {
        authors.add(author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", authors=" + authors.stream().map(author -> author.name).collect(Collectors.joining()) +
                '}';
    }
}