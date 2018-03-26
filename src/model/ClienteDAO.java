package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import model.Cliente;

public class ClienteDAO {
    
    private Set<Cliente> clientes;

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
