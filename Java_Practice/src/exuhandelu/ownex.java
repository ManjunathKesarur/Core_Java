package exuhandelu;

class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class ownex {
    public static void main(String[] args) {
        int marks = 10;

        try {
            if (marks < 0) {
                throw new InvalidMarksException("Marks cannot be negative");
            }
            System.out.println("handeled");
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}