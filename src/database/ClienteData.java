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
    public void addCliente(Cliente c) {
        clientes.add(c);
    }

    public Set<Cliente> listarClientes() {
        return clientes;
    }
    
    public Cliente consultarCliente (int id) {
       
       for(Cliente cl : clientes){
           if(cl.getId() == id){
               return cl;
           }
       }
       return null;
    }
    public void removerCliente (Cliente c) {
        clientes.remove(c);
    }
    public void alterarCliente(Cliente c, int id) {
        Cliente cl = consultarCliente(id);
       
        try {
            cl.setId(c.getId());
            cl.setNome(c.getNome());
            cl.setIdade(c.getIdade());
            cl.setPais(c.getPais());
            cl.setTelefone(c.getTelefone());
        } catch (Exception ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
