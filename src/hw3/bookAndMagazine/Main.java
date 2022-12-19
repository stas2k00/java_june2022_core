package hw3.bookAndMagazine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> arrayOfPrintable = new ArrayList<>();
        ArrayList<String> authorsBook1 = new ArrayList<>();
        authorsBook1.add("Vovk Andrii");
        Book book1 = new Book("Vasya", authorsBook1,500,2000);
        Magazine shop1 = new Magazine(22,"Abetka");
        arrayOfPrintable.add(book1);
        arrayOfPrintable.add(shop1);
        arrayOfPrintable.get(0).print();
        arrayOfPrintable.get(1).print();
        System.out.println(arrayOfPrintable.get(0));
        Printable.testPrint();

    }
}
