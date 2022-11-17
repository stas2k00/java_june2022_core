package hw2.pcs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ultrabook {
    private Laptop cpuGpuRam;
    private final String mode="Power efficient";
}
