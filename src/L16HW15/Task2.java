package L16HW15;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        //2. Create two arrays: Author[] authors and Book[] books. Their elements must use
        //elements from the neighboring array.
        Author[] authors = getAuthors();
        Book[] books = getBooks();

        authors[0].addBook(books[0]);
        authors[1].addBook(books[1]);
        authors[2].addBook(books[2]);
        authors[2].addBook(books[4]);
        authors[3].addBook(books[3]);
        authors[3].addBook(books[4]);
        books[4].addAuthor(authors[2]);
        books[4].addAuthor(authors[3]);
        //3. Create a stream of books
              //a. check if some/all book(s) have more than 200 pages;
        Arrays.stream(books)
                .filter(p -> p.numberOfPages > 200)
       //4. Use peek method for debugging intermediate streams during execution the previous
       //task.
       .peek(System.out::println);

       //b. find the books with max and min number of pages;
        Book minBook=Arrays.stream(books)
                .min((number1, number2) ->
                                        number1.numberOfPages < number2.numberOfPages ? 1 : -1).get();
        System.out.println(minBook.numberOfPages);
        //b. find the books with max and min number of pages;
        Book maxBook = Arrays.stream(books)
                .max((number1, number2) ->
                        number1.numberOfPages < number2.numberOfPages ? 1 : -1).get();
        System.out.println(maxBook.numberOfPages);

       // c filter books with only single author;
        Arrays.stream(books)
                .filter(book -> (book.authors.size() == 1))
                .forEach(System.out::println);

       // d sort the books by number of pages/title;
        Comparator<Book> titleCompare = Comparator.comparing(o -> o.title);
        Comparator<Book> pageCompare = Comparator.comparing(o -> o.numberOfPages);
        Arrays.stream(books).sorted(titleCompare).forEach(System.out::println);
        Arrays.stream(books).sorted(pageCompare).forEach(System.out::println);

        // e,f get list of all titles and print them using forEach method;
        //5.Use parallel stream with subtask #3.
        Stream<Book> parallelStreamExample=Arrays.stream(books);
        parallelStreamExample.parallel()
                .map(book -> book.title).forEach(System.out::println);

        // g get distinct list of all authors
        Arrays.stream(books)
                .flatMap(book -> book.authors.stream())
                .distinct()
                .sorted(Comparator.comparing(author -> author.name))
                .forEach(System.out::println);

    }

    private static Author[] getAuthors() {
        return new Author[]{
                new Author("Tolstoy"),
                new Author("Moem", (short) 146),
                new Author("Lukyanenko", (short) 52),
                new Author("Perumov", (short) 57)

        };
    }

    private static Book[] getBooks() {
        return new Book[]{
                new Book("War and peace", 1500),
                new Book("Theatre", 600),
                new Book("Glass sea", 400),
                new Book("Godsdoom", 350),
                new Book ("No time for Dragons",700)
        };
    }


}
