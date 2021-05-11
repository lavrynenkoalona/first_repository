package HW9;

public class Book {
    private String autor;
    private int page;
    private int year;

    public Book(){ autor = "J.London";
       page = 900;
       year=1990;

    }
    public Book(int page) {
        this.page = page;
    }

    public Book(String autor, int page, int year) {
        this.autor = autor;
        this.page = page;
        this.year = year;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
