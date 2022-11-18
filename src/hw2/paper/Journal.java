package hw2.paper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Journal extends Book{
    private String journalCompany;
    private String journalName;

    public Journal(String journalCompany, String journalName, String years, int pages) {
        super(years, pages);
        this.journalCompany = journalCompany;
        this.journalName = journalName;
    }
    public Journal(String journalCompany, String journalName, String years) {
        super(years);
        this.journalCompany = journalCompany;
        this.journalName = journalName;
    }

}
