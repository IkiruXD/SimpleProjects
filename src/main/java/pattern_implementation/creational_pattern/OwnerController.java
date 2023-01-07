package pattern_implementation.creational_pattern;

public class OwnerController implements Company {
    private final Company company;

    public OwnerController(Company company) {
        this.company = company;
    }

    @Override
    public void owner(String name) {
        company.owner(name);
    }
}

