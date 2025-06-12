/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gbitdinger.monitoria;

/**
 *
 * @author guest-iatxnv
 */
public class Monitoria {

    public static void main(String[] args) {
	    AlunoMestrado alunoMestrado = new AlunoMestrado();
	    alunoMestrado.setCodigo(33345);
	    alunoMestrado.setNome("Jose Oliveira");
	    alunoMestrado.setEndereco("Rua Prof Lauro Eduardo Werneck n 1002");
        alunoMestrado.setFaltas(8);
        alunoMestrado.setMedia(8.2);
        alunoMestrado.setNotaDicertacao(7.6);
        alunoMestrado.setConceitoDicertacao(8.9);
        alunoMestrado.setNumMatricula(111222);
        alunoMestrado.setTelefone("4499929099");

       alunoMestrado.imprimeDados();

       if (alunoMestrado.aprovado())
                           System.out.println("Aluno " + alunoMestrado.getNome() + " aprovado!");
    }
}

