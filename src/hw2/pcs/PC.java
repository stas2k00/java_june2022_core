package hw2.pcs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PC {
    private String modelCpu;
    private String modelGpu;
    private String ram;
    private String storageCapacity;
}
