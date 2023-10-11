/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjherancapoo;

import domain.ContaCorrente;
import domain.ContaPoupanca;

/**
 *
 * @author mpisc
 */
public class PrjHerancaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.setNumero(10);
        cc.setSaldo(1000);
        cc.setDataAbertura("11/10/2023");
        cc.setLimite(2000);
        cc.setTaxaJuro(10);
        
        System.out.println("Conta corrente: " + cc.toString());
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero(11);
        cp.setDataAbertura("10/10/2020");
        cp.setSaldo(300);
        cp.setDiaAniversario(20);
        cp.setVariacao(51);
        System.out.println("Conta Poupanca: " + cp);
    }
    
}
