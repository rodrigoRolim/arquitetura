package modelController;

import java.util.ArrayList;
import java.util.Iterator;
import modelController.Cliente;

public class ClienteDAO {
    
	private ArrayList<Cliente> clientes;
	
	public ClienteDAO() {
		clientes = new ArrayList<Cliente>();
	}
	public boolean addCliente(Cliente c) {
		for(Cliente cl : clientes) {
			if(cl.getNome().equals(c.getNome())) {
				return false;
			}
		}
		if (c.getNome().length() < 5 ) {
			return false;
		}
		if ( c.getPais() != null ) {
			return false;
		}
		return clientes.add(c);
		
	}
        
        public ArrayList<Cliente> listarClientes() {
            return clientes;
        }
}
