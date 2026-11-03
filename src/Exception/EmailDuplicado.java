package Exception;

public class EmailDuplicado extends Exception {
    public EmailDuplicado() {
        super("El email esta duplicado.");
    }
}
