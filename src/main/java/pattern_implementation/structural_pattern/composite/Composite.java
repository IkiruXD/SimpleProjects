package pattern_implementation.structural_pattern.composite;

import java.util.ArrayList;

public class Composite implements PcComponents{
    private ArrayList<PcComponents> components = new ArrayList<>();

    public void addComponent(PcComponents component){
        components.add(component);
    }

    @Override
    public void info() {
        for(PcComponents component: components){
            component.info();
        }
    }
}
