package model;

import java.util.ArrayList;

public class PaisDAO {
	
	private ArrayList<Pais> paises;
	
	public PaisDAO() {
		this.paises = new ArrayList<Pais>();
	}
	public boolean addPais(Pais p) {
		for(Pais ps : paises) {
			if(ps.getNome().equals(p.getNome())) {
				return false;
			}
		}
		return paises.add(p);
	}
}
