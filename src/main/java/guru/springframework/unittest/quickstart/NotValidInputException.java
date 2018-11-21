package guru.springframework.unittest.quickstart;

class NotValidInputException extends RuntimeException {
    NotValidInputException(String message) {
        super(message);
    }
}