/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author Rodrigo e Lucas Joaquim
 */
public class Cliente {
    
    private String nome;
    private String telefone;
    private double limite;
    private Pais pais;
    private int idade;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {

        this.idade = idade;

        if(idade < 18) {
            this.setLimite(100);
        }

        if(idade >= 18 && idade <= 35) {
            this.setLimite(300);
        }

        if(idade > 35 ) {
            this.setLimite(500);
        }

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (this.nome.length() >= 5){
            throw new Exception("Nome precisa ter pelo menos 5 letras");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getLimite() {
        return limite;
    }

    private void setLimite(double limite) {
        this.limite = limite;
    }

    public Pais getPais() {
        return this.pais;
    }
        
    public void setPais(Pais pais) throws Exception {

        if( pais == null ){
            throw new Exception("Pais não válido");
        }

        this.pais = pais;

        if(pais.getNome().equals("Brasil")) {
            this.limite = this.limite + 100;
        }

    }
	
}
