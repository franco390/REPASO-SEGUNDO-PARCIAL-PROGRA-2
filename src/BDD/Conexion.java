package BDD;

import Model.Cliente;

import java.sql.*;
import java.util.Set;
import java.util.HashSet;

public class Conexion {

    Connection conn;

    private void crearConexion(){

        try{
            conn = DriverManager.getConnection("jdbc:mysql://172.16.1.64:3306/midb");
        } catch (SQLException e) {
            System.out.println("No se pudo crear la conexion.");
        }
    }

    private void insertarPersona(Cliente c){

        try(PreparedStatement ps = conn.prepareStatement("insert into clientes values (?,?, ?)")) {

            ps.setString(1, c.getNombre());
            ps.setString(2, c.getEmail());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR.");
        }
    }

    private void crearTabla(){

        String sql = """
                CREATE TABLE IF NOT EXISTS sistematurismoparcial.clientes (
                idclientes INT NOT NULL,
                nombreCliente VARCHAR(45) NOT NULL,
                correo VARCHAR(45) NOT NULL,
                PRIMARY KEY (idclientes)
                );
                                """;

        try(Statement st = conn.createStatement()){

            st.execute(sql);
        } catch (SQLException e) {
            System.out.println("No se pudo crear la tabla.");
        }

    }

    private void actualizarCliente(int dni, String nuevoNombre){

        try(PreparedStatement ps = conn.prepareStatement("UPDATE clientes SET nombre = ? WHERE dni = ?")) {

            /// van los ps. algo aca jeje

        } catch (SQLException e) {
            System.out.println("Error al actualizar la persona.");
        }
    }

    public Set<Cliente> listarCliente() throws SQLException {
        Set<Cliente> clientes = new HashSet<>();

        try(Statement st = conn.createStatement(); ResultSet rs = st.executeQuery("select * from clientes")){

            Cliente c;
            while(rs.next()){

                c = new Cliente(rs.getString("nombre"), rs.getString("email"));
                clientes.add(c);
            }


        }
        catch (SQLException e){
            System.out.println("No se pudo listar el cliente.");
        }

        return clientes;

    }
}

