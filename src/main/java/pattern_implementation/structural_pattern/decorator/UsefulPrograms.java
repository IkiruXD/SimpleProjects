package pattern_implementation.structural_pattern.decorator;

public class UsefulPrograms extends Decorator{
    LocalDisk localDisk;

    public UsefulPrograms(LocalDisk localDisk) {
        this.localDisk = localDisk;
    }

    @Override
    public String getInfo() {
        return localDisk.getName() + " + some useful program";
    }

    @Override
    public int getSize() {
        return localDisk.getSize() - 5;
    }
}
