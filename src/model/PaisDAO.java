package modelController;

import java.util.ArrayList;
import modelController.Pais;

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
        public ArrayList<Pais> listagemPais(){
            return paises;
        }
}
