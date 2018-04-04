package database;

import java.util.HashSet;
import java.util.Set;
import model.Pais;

public class PaisDAO {
	
    private final Set<Pais> paises;
    
    public PaisDAO() {
        this.paises = new HashSet<>();
    }
    
    public boolean addPais(Pais p) {
        return paises.add(p);
    }
    
    public Set<Pais> listagemPais(){
        return paises;
    }
    
}
