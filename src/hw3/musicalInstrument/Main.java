package hw3.musicalInstrument;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> arrayOfInstrument = new ArrayList<>();
        arrayOfInstrument.add(new Guitar(10));
        arrayOfInstrument.add(new Drum(20));
        arrayOfInstrument.add(new Trumpet(33));
        arrayOfInstrument.forEach(instrument -> System.out.println(instrument.play()));
    }
}
