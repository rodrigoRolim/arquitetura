/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import database.PaisData;
import model.Pais;

public class PaisDAO {
    private PaisData data;
    public PaisDAO(){
        data = new PaisData();
    }
    void criar (Pais p) {
        data.addPais(p);
    }
    void alterar (Pais p, int id) {
        
    }
    void excluir (int id) {
        
    }
    Pais ler (int id) {
        return null;
    }
    Pais[] ler () {
        return (Pais[]) data.listagemPais().toArray();
    }    
}