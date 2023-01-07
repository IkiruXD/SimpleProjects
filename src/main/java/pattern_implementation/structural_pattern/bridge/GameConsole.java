package pattern_implementation.structural_pattern.bridge;

import pattern_implementation.structural_pattern.adapter.TypeDevice;

public class GameConsole extends Device{
    public GameConsole(TypeDevice type) {
        super(type);
    }

    @Override
    public void inform() {
        System.out.println("Game Console");
        type.setType();
    }
}
