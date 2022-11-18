package hw2.pcs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Workstation {
    private Laptop laptop;
    private String perfomance;

    public Workstation(
            String modelCpu,
            String modelGpu,
            String ram,
            String storageCapacity,
            String display,
            String perfomance
    ) {
        this.laptop = new Laptop(modelCpu, modelGpu, ram, storageCapacity, display);
        this.perfomance = perfomance;
    }
}
