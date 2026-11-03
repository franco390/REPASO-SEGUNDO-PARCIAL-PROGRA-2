package Model;
import Enum.TipoActividad;
import Exception.ReservaOcupada;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReservaPaquetes <T extends Actividades>{

    private List<T> listActividades;

    public ReservaPaquetes() {
        this.listActividades = new ArrayList<>();
    }

    public void agregarActividad(T actividad){

        listActividades.add(actividad);
    }

    public void reservarPaquete() throws ReservaOcupada {
        for (T actividad : listActividades) {
            if (!actividad.hayCupo()) {
                throw new ReservaOcupada();
            }
        }

        for (T actividad : listActividades) {
            actividad.reservarCupo();
        }
    }


}
