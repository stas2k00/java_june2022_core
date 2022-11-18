package hw2.paper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor

@Data
public class Comics extends Book{
    private String comicsCompany;
    private String comicsName;
    private String volume;
    public Comics(){
        super();
    }

    public Comics(String comicsCompany, String comicsName,String volume, String years, int pages) {
        super(years, pages);
        this.volume = volume;
        this.comicsCompany = comicsCompany;
        this.comicsName = comicsName;
    }
    public Comics(String comicsCompany, String comicsName,String volume, String years) {
        super(years);
        this.volume = volume;
        this.comicsCompany = comicsCompany;
        this.comicsName = comicsName;
    }
}
