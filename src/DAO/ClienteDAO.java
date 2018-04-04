/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import database.ClienteData;
import model.Cliente;

public class ClienteDAO {
    
    private final ClienteData data;
    
    public ClienteDAO () {
        data = new ClienteData();
    }
    
    void criar (Cliente c) {
        data.addCliente(c);
    }
    void alterar (Cliente c, int id) {
        data.alterarCliente(c, id);
    }
    void excluir (Cliente c) {
        data.removerCliente(c);
    }
    Cliente ler (int id) {
        return data.consultarCliente(id);
    }
    Cliente[] ler () {
        return (Cliente[]) data.listarClientes().toArray();
    }
}
