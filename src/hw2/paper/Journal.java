package hw2.paper;
public class Journal extends Book{
    private String journalCompany;
    private String journalName;

    public Journal() {
    }

    public Journal(int pages, String journalCompany, String journalName) {
        super(pages);
        this.journalCompany = journalCompany;
        this.journalName = journalName;
    }

    public Journal(int years, int pages, String journalCompany, String journalName) {
        super(years, pages);
        this.journalCompany = journalCompany;
        this.journalName = journalName;
    }

    public Journal(String journalCompany, String journalName) {
        this.journalCompany = journalCompany;
        this.journalName = journalName;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "journalCompany='" + journalCompany + '\'' +
                ", journalName='" + journalName + '\'' +
                "} " + super.toString();
    }
}
