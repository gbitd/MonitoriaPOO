package com.gbitd.projeto.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.GridLayout;

class CalculadoraView extends JFrame {

    CalculadoraView(){
        setTitle("Calculadora Java Swing");
        setSize(320, 480);
        setLocationRelativeTo(null);
        setLayout(new GridLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
