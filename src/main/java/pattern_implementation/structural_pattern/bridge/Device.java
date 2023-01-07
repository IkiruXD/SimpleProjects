package pattern_implementation.structural_pattern.bridge;

import pattern_implementation.structural_pattern.adapter.TypeDevice;

public abstract class Device {
    TypeDevice type;

    public Device(TypeDevice type) {
        this.type = type;
    }

    public abstract void inform();
}

