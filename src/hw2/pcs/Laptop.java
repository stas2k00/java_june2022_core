package hw2.pcs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Laptop {
    private PC pc;
    private String display;

    public Laptop(
            String modelCpu,
            String modelGpu,
            String ram,
            String storageCapacity,
            String display) {
        this.pc = new PC(modelCpu,modelGpu,ram,storageCapacity);
        this.display = display;
    }

    public Laptop(PC pc) {
        this.pc = pc;
    }
}
