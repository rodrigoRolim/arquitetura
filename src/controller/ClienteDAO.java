package controller;

import java.util.ArrayList;
import model.Cliente;

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
}
