package pattern_implementation.structural_pattern.bridge;

import pattern_implementation.structural_pattern.adapter.TypeDevice;

public class PortableDevice implements TypeDevice {
    @Override
    public void setType() {
        System.out.println("Portable");
    }
}
