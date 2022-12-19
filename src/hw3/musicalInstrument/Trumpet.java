package hw3.musicalInstrument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Trumpet implements Instrument{
    int length;

    @Override
    public String play() {
        return ("Грає інструмент труба з довжиною "+this.length);
    }
}
