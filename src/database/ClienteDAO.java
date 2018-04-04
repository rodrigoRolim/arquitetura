package database;

import java.util.HashSet;
import java.util.Set;
import model.Cliente;

public class ClienteDAO {
    
    private final Set<Cliente> clientes;

    public ClienteDAO() {
        clientes = new HashSet<>();
    }
    public void addCliente(Cliente c) {
        clientes.add(c);
    }

    public Set<Cliente> listarClientes() {
        return clientes;
    }
}
