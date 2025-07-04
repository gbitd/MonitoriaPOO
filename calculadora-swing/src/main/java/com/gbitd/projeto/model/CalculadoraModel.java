package com.gbitd.projeto.model;

public class CalculadoraModel{
    private double resultado;
    private double operador1;
    private double operador2;

    public CalculadoraModel(){

    }

    public CalculadoraModel(double operador1, double operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public void soma(double a, double b){
       resultado = a + b;
    }
    public void soma(){
       resultado = operador1 + operador2;
    }

    public void subtracao(double a, double b){
        resultado = a - b;
    }
    public void subtracao(){
        resultado = operador1 - operador2;
    }


    public void multiplicacao(double a, double b){
        resultado = a * b;
    }
    public void multiplicacao(){
        resultado = operador1 * operador2;
    }

    public void divisao(double a, double b){
        resultado = a / b;
    }
    public void divisao(){
        resultado = operador1 / operador2;
    }

    public double getResultado() {
        return resultado;
    }

    public double getOperador1() {
        return operador1;
    }

    public void setOperador1(double operador1) {
        this.operador1 = operador1;
    }

    public double getOperador2() {
        return operador2;
    }

    public void setOperador2(double operador2) {
        this.operador2 = operador2;
    }


}
