package com.gbitd.projeto.controllers;

import com.gbitd.projeto.model.CalculadoraModel;
import com.gbitd.projeto.view.CalculadoraView;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.List;
import java.awt.event.ActionEvent;

/**
 * CalculadoraController
 * Ideia principal: Pegar o texto atual do visor, definir operandos e operador, e pedir a execução da operação adequada no model (serviço)
 */
public class CalculadoraController {

    private CalculadoraModel model;
    private CalculadoraView view;


    public CalculadoraController(CalculadoraModel model, CalculadoraView view){
        this.model = model;
        this.view = view;
    }

    public void configurarListeners(){

        view.getBotao1().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent){
                    linkBtn1();
                }
            });
        view.getBotao2().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent){
                    linkBtn2();
                }
            });
    }

    public void identificaOperacao(){
        String texto = view.getTextoVisor();
        ArrayList<Character> listaDeCaracteres = new ArrayList<>();
        for (int i = 0; i<texto.length(); i++) {
            listaDeCaracteres.add(texto.charAt(i));
        };

        while(listaDeCaracteres[i]!=)

    }


}
