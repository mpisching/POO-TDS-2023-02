/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjexemplovetores;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mpisc
 */
public class PrjExemploVetores {
    
    
    static Scanner entrada = new Scanner(System.in);
    static final int TAM = 5;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaração de vetor
        // tipo_de_dado[] nomeVariavelVetor = new tipo_de_dado[TAM];
        //int[] notas = {8, 9, 10, 5, 3};//new int[5]
        int[] notas = new int[TAM];
        
        //entrada de dados
        //o que não se deve fazer
//        System.out.println("Informe a primeira nota");
//        notas[0] = entrada.nextInt();
//        System.out.println("Informe a segunda nota");
//        notas[1] = entrada.nextInt();
//        System.out.println("Informe a terceira nota");
//        notas[2] = entrada.nextInt();
        //solução mais adequada para a entrada de dados em vetor
        
        System.out.println("Você deseja iniciar o vetor automaticamnte (1) ou digitar as notas (2)");
        int opcao = entrada.nextInt();
        switch(opcao) {
            case 1: 
                notas = inicializarVetor();
                break;
            case 2: 
                notas = solicitarEntrada();
                break;
            default: System.out.println("Opção invalida"); System.exit(0);
        }
       
        //for aprimorado do java
        imprimir(notas);
        
        
    }

    private static void imprimir(int[] notas) {
        int cont = 0;
        for (int nota: notas) {
            System.out.println("Nota " + (++cont) + ": " + nota);
        }
    }

    private static int[] solicitarEntrada() {
        int[] notas = new int[TAM];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextInt();
        }
        return notas;
    }

    private static int[] inicializarVetor() {
        int[] notas = new int[TAM];
        Random r = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = r.nextInt(11);
        }
        return notas;
    }
    
}
