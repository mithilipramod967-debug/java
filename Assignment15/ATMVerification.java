class InvalidPINException extends Exception {

    public InvalidPINException(String message) {
        super(message);
    }
}

public class ATMVerification {

    static void verifyPIN(int pin) throws InvalidPINException {

        int correctPIN = 1234;

        if (pin != correctPIN) {
            throw new InvalidPINException("Invalid PIN entered.");
        } else {
            System.out.println("PIN verified successfully.");
        }
    }

    public static void main(String[] args) {

        try {
            verifyPIN(1234);
        } catch (InvalidPINException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}