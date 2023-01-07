package pattern_implementation.structural_pattern.bridge;

import pattern_implementation.structural_pattern.adapter.TypeDevice;

public class PC extends Device{
    public PC(TypeDevice type) {
        super(type);
    }

    @Override
    public void inform() {
        //System.out.println("PC");
        type.setType();
    }
}
