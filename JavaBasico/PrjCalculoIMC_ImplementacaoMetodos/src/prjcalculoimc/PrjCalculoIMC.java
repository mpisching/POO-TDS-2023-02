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
        int opcao = 0;
        do {
            //entrada de dados
            System.out.print("Nome.....: ");
            String nome = entrada.nextLine();
            System.out.print("Peso.....: ");
            float peso = Float.parseFloat(entrada.nextLine());
            System.out.print("Altura...: ");
            float altura = Float.parseFloat(entrada.nextLine());

            float imc = calcularIMC(peso, altura);
            
            String classificacao = classificarIMC(imc);

            imprimirIMC(nome, imc, classificacao);
            
            System.out.print("Calcular novamente? (1 - Sim; 2 - Não)");
            opcao = Integer.parseInt(entrada.nextLine());
            
        } while (opcao == 1);
        
    }
    
    public static float calcularIMC(float p, float a) {
        float imc = p / (a * a);
        return imc;
    }
    
    public static String classificarIMC(float imc) {
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
        return classificacao;
    }

    private static void imprimirIMC(String nome, float imc, String classificacao) {
        System.out.println("**** Resultado ****");
        System.out.println(nome + " seu IMC é " + imc + " e está classficado como " + classificacao);
    }
}
