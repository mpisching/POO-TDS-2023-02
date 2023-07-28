/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjcalculoimc;

import javax.swing.JOptionPane;

/**
 *
 * @author mpisc
 */
public class PrjCalculoIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //entrada de dados
        String nome = JOptionPane.showInputDialog("Nome");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Peso"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Altura"));
        //processos
        //calculo
        float imc = peso / (altura * altura);
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
        
        JOptionPane.showMessageDialog(null, "**** Resultado **** \n" +
                nome + " seu IMC é " + imc + 
                " e está classficado como " + classificacao);
    }
    
}
