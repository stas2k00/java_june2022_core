package hw2.paper;
public class Comics extends Book{
    private String comicsCompany;
    private String comicsName;
    private String volume;

    public Comics() {
    }

    public Comics(String comicsCompany, String comicsName, String volume ,int years, int pages) {
        super(years, pages);
        this.comicsCompany = comicsCompany;
        this.comicsName = comicsName;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "comicsCompany='" + comicsCompany + '\'' +
                ", comicsName='" + comicsName + '\'' +
                ", volume='" + volume + '\'' +
                "} " + super.toString();
    }
}
