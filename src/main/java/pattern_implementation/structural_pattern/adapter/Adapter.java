package pattern_implementation.structural_pattern.adapter;

public class Adapter implements Socket{
    private TV tv;

    public Adapter(TV tv) {
        this.tv = tv;
    }

    @Override
    public void connectWithCable() {
        this.tv.insertCable();
        this.tv.turnOn();
    }
}
