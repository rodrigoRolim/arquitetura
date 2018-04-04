package database;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
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
     public Pais consultarPais (int id) {
       
       for(Pais p : paises){
           if(p.getId() == id){
               return p;
           }
       }
       return null;
    }
    public void removerPais (Pais p) {
        paises.remove(p);
    }
    public void alterarPais(Pais p, int id) {
        Pais ps = consultarPais(id);
       
        try {
            ps.setId(p.getId());
            ps.setNome(p.getNome());
            ps.setSigla(p.getSigla());
        } catch (Exception ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
