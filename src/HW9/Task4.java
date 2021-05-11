package HW9;

public class Task4 {
    //4) Create class with 3 variables and 3 constructors. Add usage of all constructor and variables in main method in other class
    public static void main(String[] args) {
        Book book1 = new Book("London",900,1985);
        System.out.println("autor" + book1.getAutor());
        System.out.println("page" + book1.getPage());
        System.out.println("year" + book1.getYear());
        System.out.println("==========================");
        Book book2 = new Book();
        System.out.println(book2);
        System.out.println("==========================");
        Book book3 = new Book(900);
        System.out.println(book3);
        System.out.println("page" + book1.getPage());

    }
}
