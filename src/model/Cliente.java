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
	private int Idade;
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
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
	public void setNome(String nome) {
		this.nome = nome;
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
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
		if(pais.getNome().equals("Brasil")) {
			this
		}
	}
	
}
