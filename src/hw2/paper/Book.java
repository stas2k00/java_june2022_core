package hw2.paper;
public class Book extends Papyrus {
    private String nameBook;
    private int pages;

    public Book() {
    }

    public Book(String nameBook, int pages) {
        this.nameBook = nameBook;
        this.pages = pages;
    }

    public Book(String nameBook, int years, String authors, int pages) {
        super(years, authors);
        this.nameBook = nameBook;
        this.pages = pages;
    }

    public Book(String nameBook, int years, int pages) {
        super(years);
        this.nameBook = nameBook;
        this.pages = pages;
    }
    public Book(int years, String authors, int pages) {
        super(years, authors);
        this.pages = pages;
    }

    public Book(int years, int pages) {
        super(years);
        this.pages = pages;
    }

    public Book(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", pages=" + pages +
                "} " + super.toString();
    }
}
