package pattern_implementation.structural_pattern.decorator;

public abstract class LocalDisk {
    String name = "none";

    public String getName(){return name;}

    public abstract int getSize();
}

