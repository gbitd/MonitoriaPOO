package com.gbitd.projeto.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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

        botao0 = new JButton("0");
        botao1 = new JButton("1");
        botao2 = new JButton("2");
        botao3 = new JButton("3");
        botao4 = new JButton("4");
        botao5 = new JButton("5");
        botao6 = new JButton("6");
        botao7 = new JButton("7");
        botao8 = new JButton("8");
        botao9 = new JButton("9");
        botaoSoma = new JButton("+");
        botaoSubtracao = new JButton("-");
        botaoMultiplicacao = new JButton("*");
        botaoDivisao = new JButton("/");
        botaoIgualdade = new JButton("=");
        botaoVirgula = new JButton(".");
        visor = new JTextField();

        //Array de Jbutton para diminuir a repetição no código
        JButton[] botoesNumericos = {
            botao0, botao1, botao2, botao3, botao4,
            botao5, botao6, botao7, botao8, botao9
        };


        //Configura botoes para atualizar visor
        //Esses eventos são tratados aqui porque tem apenas relação com a view
        //Eventos que tem a ver com o modelo precisam ser tratados pelo controller
        for (int i = 0; i < 10; i++) {
            final String numero = String.valueOf(i);
            botoesNumericos[i].addActionListener(new ActionListener() {
                    @Override // O Override garante que o método actionPerformed seja sobrescrito em tempo de compilação
                              // Em caso de erro de digitação, ele acusa Erro: método não existe na superclasse
                    public void actionPerformed(ActionEvent actionEvent){
                        atualizaVisor(numero);
                    }
                });
        }
        botaoSoma.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent){
                    atualizaVisor("+");
                }
            });
        botaoSubtracao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent){
                    atualizaVisor("-");
                }
            });
        botaoMultiplicacao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent){
                    atualizaVisor("*");
                }
            });
        botaoDivisao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent){
                    atualizaVisor("/");
                }
            });
        botaoVirgula.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent){
                    atualizaVisor(".");
                }
            });


        //Adiciona o visor e o painel de botoes
        //
        add(visor, BorderLayout.NORTH);

        JPanel panelBotoes = new JPanel();
        panelBotoes.setLayout(new GridLayout(4, 4));
        panelBotoes.add(botao7);
        panelBotoes.add(botao8);
        panelBotoes.add(botao9);
        panelBotoes.add(botaoSubtracao);
        panelBotoes.add(botao4);
        panelBotoes.add(botao5);
        panelBotoes.add(botao6);
        panelBotoes.add(botaoSoma);
        panelBotoes.add(botao1);
        panelBotoes.add(botao2);
        panelBotoes.add(botao3);
        panelBotoes.add(botaoDivisao);
        panelBotoes.add(botao0);
        panelBotoes.add(botaoVirgula);
        panelBotoes.add(botaoIgualdade);
        panelBotoes.add(botaoMultiplicacao);

        add(panelBotoes, BorderLayout.CENTER);

        setVisible(true);

    }

    public void atualizaVisor(String texto){
        visor.setText(visor.getText() + texto);
    }

    public void setTextoVisor(String texto){
        visor.setText(texto);
    }

    public String getTextoVisor(){
        return visor.getText();
    }

    public void mensagemErro(){
        JOptionPane.showMessageDialog(null, "Algo deu errado, tente novamente!");
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
