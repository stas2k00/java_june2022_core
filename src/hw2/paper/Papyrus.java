package hw2.paper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Papyrus {
    private String text;
    private String titlePapyrus;
    private String Authors;
    private String years;
    public Papyrus(String years){
        this.years = years;
    }
    public Papyrus(String years,String authors){
        this.years = years;
        this.Authors = authors;
    }
}
