/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitetura;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class Cliente {
    
    private String nome;
    ArrayList<String> cliente = new ArrayList<String>();
    public void addCliente(String name){
        cliente.add(name);
    }

    public ArrayList<String> getList() {
        return cliente;
    }
    
}
