package hw3.bookAndMagazine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Printable{
    String bookTitle;
    ArrayList<String> authors;
    int page;
    int years;

    @Override
    public void print() {
        System.out.println("Book");
    }
}
