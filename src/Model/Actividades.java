package Model;
import Exception.ReservaOcupada;

public abstract class Actividades {

    private String descripcion;
    private int cuposReservados = 0;
    private int cupoMaximo;
    private double costo;

    public Actividades(double costo, int cupoMaximo, int cuposReservados, String descripcion) {
        this.costo = costo;
        this.cupoMaximo = cupoMaximo;
        this.cuposReservados = cuposReservados;
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public int getCuposReservados() {
        return cuposReservados;
    }

    public void setCuposReservados(int cuposReservados) {
        this.cuposReservados = cuposReservados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void reservarCupo() throws ReservaOcupada {

        if (cuposReservados >= cupoMaximo){
            throw new ReservaOcupada();
        }

        cuposReservados++;
    }

    public boolean hayCupo() {
        return cuposReservados < cupoMaximo;
    }
}
