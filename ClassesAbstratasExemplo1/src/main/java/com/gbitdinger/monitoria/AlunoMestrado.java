/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gbitdinger.monitoria;

/**
 *
 * @author guest-iatxnv
 */
public class AlunoMestrado extends Aluno {

	private Double conceitoDicertacao;
	private Double notaDicertacao;

	public AlunoMestrado(){

	}

	public AlunoMestrado(Double conceitoDicertacao, Double notaDicertacao) {
		this.conceitoDicertacao = conceitoDicertacao;
		this.notaDicertacao = notaDicertacao;
	}

	public void imprimeDados(){
		int codigo_local = this.getCodigo();
		int numMatricula = this.getNumMatricula();
		Double media = this.getMedia();
		int faltas = this.getFaltas();
		System.out.println("Codigo: "+ codigo_local);
		System.out.println("Nome: "+ nome);
		System.out.println("Telefone: "+ telefone);
		System.out.println("Endereço: "+ endereco);
		System.out.println("Matricula: "+ numMatricula);
		System.out.println("Média: "+ media);
		System.out.println("Número de faltas: " + faltas);
		System.out.println("Conceito da Dissertação: "+ conceitoDicertacao);
		System.out.println("Nota da Dissertação: " + notaDicertacao);

	}

	public Boolean aprovado(){
		int faltas = this.getFaltas();
		return conceitoDicertacao > 7.5 && notaDicertacao > 7.5 && faltas < 14;
	}

	public Double getConceitoDicertacao() {
		return conceitoDicertacao;
	}

	public void setConceitoDicertacao(Double conceitoDicertacao) {
		this.conceitoDicertacao = conceitoDicertacao;
	}

	public Double getNotaDicertacao() {
		return notaDicertacao;
	}

	public void setNotaDicertacao(Double notaDicertacao) {
		this.notaDicertacao = notaDicertacao;
	}

	
}
