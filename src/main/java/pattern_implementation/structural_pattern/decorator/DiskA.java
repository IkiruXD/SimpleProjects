package pattern_implementation.structural_pattern.decorator;

public class DiskA extends LocalDisk {
    public DiskA() {
        name = "Disk A";
    }

    @Override
    public int getSize() {
        return 256;
    }
}