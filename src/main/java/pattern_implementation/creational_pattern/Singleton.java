package pattern_implementation.creational_pattern;

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {

        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
