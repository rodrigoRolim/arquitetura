package database;

import java.util.HashSet;
import java.util.Set;
import model.Cliente;

public class ClienteData {
    
    private final Set<Cliente> clientes;

    public ClienteData() {
        clientes = new HashSet<>();
    }
    public void addCliente(Cliente c) {
        clientes.add(c);
    }

    public Set<Cliente> listarClientes() {
        return clientes;
    }
    
    public Client consultarCliente (int id) {
        return null;
    }
    public void removerCliente (Cliente c) {
        clientes.remove(c);
    }
}
