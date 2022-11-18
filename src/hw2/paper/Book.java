package hw2.paper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Book extends Papyrus {
    private String nameBook;
    private int pages;
    public Book(String nameBook, String years, int pages) {
        super(years);
        this.nameBook = nameBook;
        this.pages = pages;
    }
    public Book(String nameBook, String years, String authors, int pages) {
        super(years,authors);
        this.nameBook = nameBook;
        this.pages = pages;
    }
    public Book(String years, int pages) {
        super(years);
        this.nameBook = nameBook;
        this.pages = pages;
    }
    public Book(int pages) {
        this.pages = pages;
    }

    public Book(String years) {
        super(years);
    }
}
