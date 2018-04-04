package database;

import java.util.HashSet;
import java.util.Set;
import model.Pais;

public class PaisData {
	
    private final Set<Pais> paises;
    
    public PaisData() {
        this.paises = new HashSet<>();
    }
    
    public boolean addPais(Pais p) {
        return paises.add(p);
    }
    
    public Set<Pais> listagemPais(){
        return paises;
    }
    
}
