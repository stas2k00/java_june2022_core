package hw2.paper;
public class Papyrus {
    private String text;
    private String titlePapyrus;
    private String Authors;
    private int years;
    public Papyrus() {
    }
    public Papyrus(String text, String titlePapyrus, String authors, int years) {
        this.text = text;
        this.titlePapyrus = titlePapyrus;
        Authors = authors;
        this.years = years;
    }
    public Papyrus(int years){
        this.years = years;
    }
    public Papyrus(int years,String authors){
        this.years = years;
        this.Authors = authors;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "text='" + text + '\'' +
                ", titlePapyrus='" + titlePapyrus + '\'' +
                ", Authors='" + Authors + '\'' +
                ", years=" + years +
                '}';
    }
}
