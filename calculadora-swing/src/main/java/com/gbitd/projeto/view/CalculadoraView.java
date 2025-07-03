package com.gbitd.projeto.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class CalculadoraView extends JFrame {

    private JTextField visor;
    private JButton botaoSoma;
    private JButton botaoSubtracao;
    private JButton botaoMultiplicacao;
    private JButton botaoDivisao;
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botao4;
    private JButton botao5;
    private JButton botao6;
    private JButton botao7;
    private JButton botao8;
    private JButton botao9;
    private JButton botao0;
    private JButton botaoIgualdade;
    private JButton botaoVirgula;

    public CalculadoraView(){
        setTitle("Calculadora Java Swing");
        setSize(320, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(visor = new JTextField(), BorderLayout.NORTH);

        JPanel panelBotoes = new JPanel();
        panelBotoes.setLayout(new GridLayout(4, 4));
        panelBotoes.add(botao7 = new JButton("7"));
        panelBotoes.add(botao8 = new JButton("8"));
        panelBotoes.add(botao9 = new JButton("9"));
        panelBotoes.add(botaoSubtracao = new JButton("-"));
        panelBotoes.add(botao4 = new JButton("4"));
        panelBotoes.add(botao5 = new JButton("5"));
        panelBotoes.add(botao6 = new JButton("6"));
        panelBotoes.add(botaoSoma = new JButton("+"));
        panelBotoes.add(botao1 = new JButton("1"));
        panelBotoes.add(botao2 = new JButton("2"));
        panelBotoes.add(botao3 = new JButton("3"));
        panelBotoes.add(botaoDivisao = new JButton("/"));
        panelBotoes.add(botao0 = new JButton("0"));
        panelBotoes.add(botaoVirgula = new JButton(","));
        panelBotoes.add(botaoIgualdade = new JButton("="));
        panelBotoes.add(botaoMultiplicacao = new JButton("*"));

        add(panelBotoes, BorderLayout.CENTER);

        setVisible(true);

    }

    public JTextField getVisor() {
        return visor;
    }

    public JButton getBotaoSoma() {
        return botaoSoma;
    }

    public JButton getBotaoSubtracao() {
        return botaoSubtracao;
    }

    public JButton getBotaoMultiplicacao() {
        return botaoMultiplicacao;
    }

    public JButton getBotaoDivisao() {
        return botaoDivisao;
    }

    public JButton getBotao1() {
        return botao1;
    }

    public JButton getBotao2() {
        return botao2;
    }

    public JButton getBotao3() {
        return botao3;
    }

    public JButton getBotao4() {
        return botao4;
    }

    public JButton getBotao5() {
        return botao5;
    }

    public JButton getBotao6() {
        return botao6;
    }

    public JButton getBotao7() {
        return botao7;
    }

    public JButton getBotao8() {
        return botao8;
    }

    public JButton getBotao9() {
        return botao9;
    }

    public JButton getBotao0() {
        return botao0;
    }

    public JButton getBotaoIgualdade() {
        return botaoIgualdade;
    }

    public JButton getBotaoVirgula() {
        return botaoVirgula;
    }

}
