package Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String email;
    private List<Reserva> r1;

    public Cliente(String email, String nombre) {
        this.email = email;
        this.nombre = nombre;
        this.r1 = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Reserva> getReserva() {
        return r1;
    }

    public void setReserva(List<Reserva> reserva) {
        this.r1 = reserva;
    }

    public void agregarReserva(Reserva reserva){
        r1.add(reserva);
    }
}
