package pattern_implementation.structural_pattern.composite;

public class Motherboard implements PcComponents{
    @Override
    public void info() {
        System.out.println("MotherBoard");
    }
}
