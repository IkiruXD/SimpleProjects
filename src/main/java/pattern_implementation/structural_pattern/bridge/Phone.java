package pattern_implementation.structural_pattern.bridge;

import pattern_implementation.structural_pattern.adapter.TypeDevice;

public class Phone extends Device{
    public Phone(TypeDevice type) {
        super(type);
    }

    @Override
    public void inform() {
        System.out.println("Phone");
        type.setType();
    }
}
