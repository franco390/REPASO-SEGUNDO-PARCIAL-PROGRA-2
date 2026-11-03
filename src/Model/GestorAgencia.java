package Model;

import java.util.ArrayList;
import java.util.List;
import Exception.EmailDuplicado;

public class GestorAgencia {

    private List<Cliente> listCliente;

    public GestorAgencia() {
        this.listCliente = new ArrayList<>();
    }

    public void registroCliente(Cliente cliente) throws EmailDuplicado {

        for (Cliente c : listCliente){
            if (c.getEmail().equals(cliente.getEmail())){
                throw new EmailDuplicado();
            }
        }

        listCliente.add(cliente);

    }

    public void reservarActividadIndividual(Cliente c, Actividades a) throws ReservaOcupada {

        a.reservarCupo();

        Reserva r = new Reserva(a)
    }
}
