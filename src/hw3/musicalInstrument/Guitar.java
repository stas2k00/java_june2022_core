package hw3.musicalInstrument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Guitar implements Instrument{
    int countCord;

    @Override
    public String play() {
        return ("Грає інструмент гітара з к-стю струн "+this.countCord);
    }
}
