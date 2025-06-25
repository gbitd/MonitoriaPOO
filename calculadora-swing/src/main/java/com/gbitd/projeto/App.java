package com.gbitd.projeto;

import java.awt.Color;

import javax.swing.JFrame;

import javax.swing.WindowConstants;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        JFrame teste = new JFrame(null, null);
        teste.setTitle("Teste");
        teste.setSize(800, 480);
        teste.getContentPane().setBackground(Color.GREEN);
        teste.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        teste.setVisible(true);

    }
}
