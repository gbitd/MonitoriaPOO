/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author André Cordeiro
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean loop;
        float peso, altura;
        String nome;
        Scanner leitura = new Scanner(System.in);
        
        loop = true;
        do {            
            try {
                
                System.out.println("Digite o seu nome ");
                nome = leitura.next();
        
                System.out.println("Digite o seu peso (numero) ");
                peso = leitura.nextInt();
                
                System.out.println("Digite a sua altura (numero) ");
                altura = leitura.nextFloat();
                
                System.out.println("Nome: " + nome);
                System.out.println("IMC: " + (peso / (altura * altura)));
                
                loop = false;
            
            } catch (InputMismatchException e) {
                leitura.nextLine(); // limpeza buffer teclado
                System.out.println(("\n Erro: " + e));
                System.out.println("\n Entrada Invalida ");
                System.out.println("\n Digite os dados novamente");
            
            } catch (ArithmeticException e){
                leitura.nextLine(); // limpeza buffer teclado
                System.out.println(("\n Erro: " + e));
                System.out.println("\n Divisao por zero ");
                System.out.println("\n Digite os dados novamente");
            }            
        } while (loop);
    }
    
}
