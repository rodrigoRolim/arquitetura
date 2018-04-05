/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.ClienteData;
import java.util.Set;
import model.Cliente;

public class ClienteSetDAO {
    
    private final Set<Cliente> database;
    
    public ClienteSetDAO () {
        database = new ClienteData().getDatabase();
    }
    
    void criar (Cliente c) {
        database.add(c);
    }
    
    void alterar (Cliente c, int id) {
        for(Cliente cliente : database){
            if(cliente.getId() == id){
                database.remove(cliente);
                database.add(cliente);
            }
        }        
    }
    
    void excluir (Cliente c) {
        database.remove(c);
    }
    
    public Cliente ler (int id) {
       for(Cliente c : database){
           if(c.getId() == id){
               return c;
           }
       }
       return null;
    }
    
    public Set<Cliente> ler () {
        return database;
    } 
    
}
