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
     public Cliente consultarPais (int id) {
       
       for(Pais p : paises){
           if(p.getId() == id){
               return p;
           }
       }
       return null;
    }
    public void removerCliente (Pais c) {
        paises.remove(c);
    }
    public void alterarCliente(Pais c, int id) {
        Pais cl = consultarPais(id);
       
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
