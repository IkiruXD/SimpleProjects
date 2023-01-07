package pattern_implementation.structural_pattern.decorator;

public class DiskB extends LocalDisk {
    public DiskB() {
        name = "Disk B";
    }

    @Override
    public int getSize() {
        return 128;
    }
}
