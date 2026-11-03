package Exception;

public class ReservaOcupada extends Exception {
    public ReservaOcupada() {
        super("Esta reserva esta ocupada.");
    }
}
