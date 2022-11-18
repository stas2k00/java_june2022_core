package hw2.pcs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ultrabook {


    private Laptop laptop;
    private String batteryLife;
    public Ultrabook(
            String modelCpu,
            String modelGpu,
            String ram,
            String storageCapacity,
            String display,
            String batteryLife
    ){
        this.laptop = new Laptop(modelCpu,modelGpu,ram,storageCapacity,display);
        this.batteryLife = batteryLife;
    }
}
