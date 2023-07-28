/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjcalculoimc;

import java.util.Scanner;

/**
 *
 * @author mpisc
 */
public class PrjCalculoIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //entrada de dados
        System.out.print("Nome.....: ");
        String nome = entrada.nextLine();
        System.out.print("Peso.....: ");
        float peso = entrada.nextFloat();
        System.out.print("Altura...: ");
        float altura = entrada.nextFloat();
        
        //processos
        //calculo
        float imc = peso / (altura * altura);
        //imc = peso / (float)Math.pow(altura, 2);
        //classificaçao
        String classificacao = "";
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 24.9) {
            classificacao = "Normal";
        } else if (imc < 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc < 39.9) {
            classificacao = "Obesidade";
        } else {
            classificacao = "Obesidade grave";
        }
        
        System.out.println("**** Resultado ****");
        System.out.println(nome + " seu IMC é " + imc + " e está classficado como " + classificacao);
    }
    
}
