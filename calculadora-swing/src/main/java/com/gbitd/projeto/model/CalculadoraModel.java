package com.gbitd.projeto.model;

public class CalculadoraModel{
    private double resultado;

    CalculadoraModel(){

    }

    public void soma(double a, double b){
       //Se quiser, pode tentar treinar tratamendo de exceção nas operações com try catch
       resultado = a + b;
    }

    public void subtracao(double a, double b){
        resultado = a - b;
    }

    public void multiplicacao(double a, double b){
        resultado = a * b;
    }

    public void divisao(double a, double b){
        resultado = a / b;
    }

    public double getResultado() {
        return resultado;
    }


}
