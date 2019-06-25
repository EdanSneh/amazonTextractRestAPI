package proj;

public class PersonError {
    public enum ErrorType {
        INVALID_REQUEST("INVALID_REQUEST");

        private final String value;

        ErrorType(String value) {
            this.value = value;
        }

        public String value() {
            return this.value;
        }

        public String toString() {
            return this.value;
        }
    }

    public enum Error {
        NO_PERSON_ID("The ID specified does not currently coorispond to a person", ErrorType.INVALID_REQUEST);

        private final String description;
        private final ErrorType errorType;

        Error(String description, ErrorType errorType) {
            this.description = description;
            this.errorType = errorType;
        }

        public String getDescription() {
            return description;
        }

        public ErrorType getErrorType() {
            return errorType;
        }

        public String toString() {
            return getDescription() + ": " + getErrorType();
        }
    }
}


