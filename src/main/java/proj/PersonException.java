package proj;

public class PersonException extends Exception {
    protected PersonError.Error error;

    public PersonException(PersonError.Error error) {
        super(error.getDescription());
        this.error = error;
    }

    public PersonError.Error getError() {
        return error;
    }
}
