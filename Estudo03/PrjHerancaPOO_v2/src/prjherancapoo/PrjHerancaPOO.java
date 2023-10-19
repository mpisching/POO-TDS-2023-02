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
        
        //System.out.println("Conta corrente: " + cc.toString());
        imprimir(cc);
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero(11);
        cp.setDataAbertura("10/10/2020");
        cp.setSaldo(300);
        cp.setDiaAniversario(20);
        cp.setVariacao(51);
        //System.out.println("Conta Poupanca: " + cp);
        imprimir(cp);
    }
    
    private static void imprimir(ContaCorrente cc) {
        System.out.println("Dados da Conta Corrente");
        System.out.println("Numero........: " + cc.getNumero());
        System.out.println("Data Abertura.: " + cc.getDataAbertura());
        System.out.println("Saldo.........: " + cc.getSaldo());
        System.out.println("Limite........: " + cc.getLimite());
        System.out.println("Taxa Juro.....: " + cc.getTaxaJuro());
    }
    
    private static void imprimir(ContaPoupanca cp) {
        System.out.println("Dados da Conta Poupanca");
        System.out.println("Numero.........: " + cp.getNumero());
        System.out.println("Data Abertura..: " + cp.getDataAbertura());
        System.out.println("Saldo..........: " + cp.getSaldo());
        System.out.println("Dia Aniversario: " + cp.getDiaAniversario());
        System.out.println("Variacao.......: " + cp.getVariacao());
    }    
    
}
