/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.PaisData;
import java.util.Set;
import model.Pais;

public class PaisSetDAO {
    
    private final Set<Pais> database;
    
    public PaisSetDAO(){
        database = new PaisData().getDatabase();
    }
    
    public void criar (Pais p) {
        database.add(p);
    }
    
    public void alterar (Pais p, int id) {
        for(Pais pais : database){
            if(pais.getId() == id){
                database.remove(pais);
                database.add(p);
            }
        }
    }
    
    public void excluir (Pais p) {
        database.remove(p);
    }
    
    public Pais ler (int id) {
        for(Pais pais : database){
            if(pais.getId() == id){
                return pais;
            }
        }
        return null;
    }
    
    public Set<Pais> ler () {
        return database;
    }    
    
}
