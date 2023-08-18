/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainapp;

import domain.Circulo;

/**
 *
 * @author mpisc
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("POO - Mundo dos Circulos");
        new Circulo();
        /*Sobre a linha 20:
          O Objeto foi criado mas está sem referência.
          É um objeto que está perdido na memória
            e não terá acesso ao seu conteúdo.
          Faz pouco sentido ter uma declaração como esta.
        */
        Circulo c1 = new Circulo(); 
        /*sobre a linha 27:
            A variável c1 é uma referência para um objeto do
                tipo Círculo na memória.
        */
        
        //raio = 2;//raio é uma variável que pertence a classe Circulo. Para ter acesso a esta variável é necessário uma variável de referência.
        c1.raio = -2;//atributo raio sendo acessado por meio da variável de referência c1
        c1.definirRaio(2);
        
        c1.calcularCircunferencia();
        
        System.out.println("Raio do circulo: " + c1.obterRaio());
        System.out.println("Área do circulo: " + c1.calcularArea());
        System.out.println("Diâmetro do circulo: " + c1.calcularDiametro());
        float circunferencia = c1.calcularCircunferencia();
        System.out.println("Circunferência: " + circunferencia);
        
        Circulo c2 = new Circulo();
        c2.raio = 3;
        
    }
    
}
