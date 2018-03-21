package model;

import java.util.ArrayList;

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
		return clientes.add(c);
	}
}
