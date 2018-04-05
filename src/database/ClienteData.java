package database;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;

public class ClienteData {
    
    private final Set<Cliente> clientes;

    public ClienteData() {
        clientes = new HashSet<>();
    }
    
    public Set getDatabase () {
        return clientes;
    }
    
}
