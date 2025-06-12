/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gbitdinger.monitoria;

/**
 *
 * @author guest-iatxnv
 */
public class Aluno extends Pessoa {
	
	private int numMatricula;
	private Double media;
	private int faltas;

	public Aluno(){

	}

	public Aluno(int numMatricula, Double media, int faltas, int codigo, String nome, String telefone, String endereco) {
		super(codigo, nome, telefone, endereco);
		this.numMatricula = numMatricula;
		this.media = media;
		this.faltas = faltas;
	}
	
	public void imprimeDados(){
		int codigo_local = this.getCodigo();
		System.out.println("Codigo: "+ codigo_local);
		System.out.println("Nome: "+ nome);
		System.out.println("Telefone: "+ telefone);
		System.out.println("Endereço: "+ endereco);
		System.out.println("Matricula: "+ numMatricula);
		System.out.println("Média: "+ media);
		System.out.println("Número de faltas: " + faltas);

	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	
	
}
