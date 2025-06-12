/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gbitdinger.monitoria;

/**
 *
 * @author guest-iatxnv
 */
public class Funcionario extends Pessoa {
	private Double salario;

	public Funcionario(){

	}
	public Funcionario(Double salario, int codigo, String nome, String telefone, String endereco) {
		super(codigo, nome, telefone, endereco);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
	
	
	
}
