package hw3.musicalInstrument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drum implements Instrument{
    int diameter;
    @Override
    public String play() {
        return ("Грає інструмент барабан з діаметром "+this.diameter);
    }
}
