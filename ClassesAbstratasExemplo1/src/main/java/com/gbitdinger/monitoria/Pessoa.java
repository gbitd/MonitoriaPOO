/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gbitdinger.monitoria;

/**
 *
 * @author guest-iatxnv
 */
public abstract class Pessoa {
	private int codigo;
	protected String nome;
	String telefone;
	public String endereco;

	public Pessoa(){

	}

	public Pessoa(int codigo, String nome, String telefone, String endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public void imprimeDados(){
		System.out.println("Codigo: "+ codigo);
		System.out.println("Nome: "+ nome);
		System.out.println("Telefone: "+ telefone);
		System.out.println("Endereço: "+ endereco);

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
