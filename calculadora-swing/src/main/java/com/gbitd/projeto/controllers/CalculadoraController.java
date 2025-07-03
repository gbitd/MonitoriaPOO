package com.gbitd.projeto.controllers;

import com.gbitd.projeto.model.CalculadoraModel;
import com.gbitd.projeto.view.CalculadoraView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * CalculadoraController
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

    public void linkBtn1(){

    }


}
