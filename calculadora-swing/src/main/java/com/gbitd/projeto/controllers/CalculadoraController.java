package com.gbitd.projeto.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.gbitd.projeto.model.CalculadoraModel;
import com.gbitd.projeto.view.CalculadoraView;

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

        //Tratamento de evento para o botao igualdade deve ser tratado pelo controller, pois usa o model
        view.getBotaoIgualdade().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent){
                    calcula();
                    exibeResultado();
                }
            });

    }

    public Character identificaOperacao(){
        String texto = view.getTextoVisor();
        StringBuilder operando1 = new StringBuilder(); //Strings são imutáveis. Em casos de repetição como em concatenações, StringBuilders ou StringBuffers são mais ideais
        StringBuilder operando2 = new StringBuilder();
        Character operador = '\n';


        int i = 0;

        while(i<texto.length() && (Character.isDigit(texto.charAt(i)) || texto.charAt(i) == '.')){
            operando1.append(texto.charAt(i));
            i++;
        }

        // O primeiro caractere após o operando1 é o operador
        if(i<texto.length()){
            operador = texto.charAt(i);
            i++;

        }

        while(i<texto.length() && (Character.isDigit(texto.charAt(i)) || texto.charAt(i) == '.')){
            operando2.append(texto.charAt(i));
            i++;
        }

        // Converte operando para String, e depois para double, e atribuí ao modelo
        model.setOperador1(Double.parseDouble(operando1.toString()));
        model.setOperador2(Double.parseDouble(operando2.toString()));

        return operador;

    }

    public void calcula(){

        Character operador = identificaOperacao();

        switch (operador){
            case '+':
                model.soma();
                break;
            case '-':
                model.subtracao();
                break;
            case '*':
                model.multiplicacao();
                break;
            case '/':
                model.divisao();
                break;
            default:
                view.mensagemErro();

        }
    }

    public void exibeResultado(){
        view.setTextoVisor(String.valueOf(model.getResultado()));;
    }


}
