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
    static int[] notas = new int[TAM];
    
    public static void main(String[] args) {
        System.out.println("Você deseja iniciar o vetor automaticamnte (1) ou digitar as notas (2)");
        int opcao = entrada.nextInt();
        switch(opcao) {
            case 1: 
                inicializarVetor();
                break;
            case 2: 
                solicitarEntrada();
                break;
            default: System.out.println("Opção invalida"); System.exit(0);
        }
       
        //for aprimorado do java
        imprimir();
        
        
    }

    private static void imprimir() {
        int cont = 0;
        for (int nota: notas) {
            System.out.println("Nota " + (++cont) + ": " + nota);
        }
    }

    private static void solicitarEntrada() {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextInt();
        }
    }

    private static void inicializarVetor() {
        Random r = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = r.nextInt(11);
        }
    }
    
}
