package Model;

import java.time.LocalDate;

public class Reserva {

    private Actividades actividad;
    private LocalDate fechaExperiencia;
    private boolean realizada;
    private Integer calificacion;

    public Reserva(Actividades actividad, LocalDate fechaExperiencia) {
        this.actividad = actividad;
        this.fechaExperiencia = fechaExperiencia;
        this.realizada = false;
        this.calificacion = null;
    }

    public Actividades getActividad() {
        return actividad;
    }

    public void setActividad(Actividades actividad) {
        this.actividad = actividad;
    }

    public LocalDate getFechaExperiencia() {
        return fechaExperiencia;
    }

    public void setFechaExperiencia(LocalDate fechaExperiencia) {
        this.fechaExperiencia = fechaExperiencia;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }
}
