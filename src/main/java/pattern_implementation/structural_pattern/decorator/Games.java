package pattern_implementation.structural_pattern.decorator;

public class Games extends Decorator {
    LocalDisk localDisk;

    public Games(LocalDisk localDisk) {
        this.localDisk = localDisk;
    }

    @Override
    public String getInfo() {
        return localDisk.getName() + " + some useful program";
    }

    @Override
    public int getSize() {
        return localDisk.getSize() - 45;
    }
}
