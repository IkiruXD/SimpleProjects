package pattern_implementation.structural_pattern.bridge;

import pattern_implementation.structural_pattern.adapter.TypeDevice;

public class StaticDevice implements TypeDevice {
    @Override
    public void setType() {
        System.out.println("not portable. static");
    }
}
