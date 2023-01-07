package comparator_example.MyException;

public class MyCoolException extends Exception {

    @Override
    public String getMessage() {
        return "Some cool exception ^_^. Group limit reached.";
    }

}
