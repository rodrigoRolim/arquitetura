/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import database.ClienteData;
import model.Cliente;

public class ClienteDAO {
    
    private ClienteData data;
    
    public ClienteDAO () {
        data = new ClienteData();
    }
    
    void criar (Cliente c) {
        data.addCliente(c);
    }
    void alterar (Cliente c, int id) {

    }
    void excluir (int id) {
        
    }
    Cliente ler (int id) {
        return null;
    }
    Cliente[] ler () {
        return null;
    }
}
