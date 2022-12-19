package hw3.bookAndMagazine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine implements Printable{
    int bookAvailable;
    String magazineName;

    @Override
    public void print() {
        System.out.println("Magazine");
    }
}
