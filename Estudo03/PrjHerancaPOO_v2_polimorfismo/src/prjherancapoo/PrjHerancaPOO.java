/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjherancapoo;

import domain.Conta;
import domain.ContaCorrente;
import domain.ContaPoupanca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mpisc
 */
public class PrjHerancaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta;
        conta = new Conta();
        //conta = new ContaPoupanca();
        //conta = new ContaCorrente();
        //ContaCorrente = new Conta();//impossível
        //ContaCorrente = new ContaPoupanca();//impossivel
        List<Conta> listaDeContas = new ArrayList<>();
        ContaCorrente cc = new ContaCorrente();
        cc.setNumero(10);
        cc.setSaldo(1000);
        cc.setDataAbertura("11/10/2023");
        cc.setLimite(2000);
        cc.setTaxaJuro(10);
        listaDeContas.add(cc);
        
        //System.out.println("Conta corrente: " + cc.toString());
        //imprimir(cc);
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero(11);
        cp.setDataAbertura("10/10/2020");
        cp.setSaldo(300);
        cp.setDiaAniversario(20);
        cp.setVariacao(51);
        //System.out.println("Conta Poupanca: " + cp);
        //imprimir(cp);
        listaDeContas.add(cp);
        imprimir(listaDeContas);
    }
    
//    private static void imprimir(ContaCorrente cc) {
//        System.out.println("Dados da Conta Corrente");
//        System.out.println("Numero........: " + cc.getNumero());
//        System.out.println("Data Abertura.: " + cc.getDataAbertura());
//        System.out.println("Saldo.........: " + cc.getSaldo());
//        System.out.println("Limite........: " + cc.getLimite());
//        System.out.println("Taxa Juro.....: " + cc.getTaxaJuro());
//    }
//    
//    private static void imprimir(ContaPoupanca cp) {
//        System.out.println("Dados da Conta Poupanca");
//        System.out.println("Numero.........: " + cp.getNumero());
//        System.out.println("Data Abertura..: " + cp.getDataAbertura());
//        System.out.println("Saldo..........: " + cp.getSaldo());
//        System.out.println("Dia Aniversario: " + cp.getDiaAniversario());
//        System.out.println("Variacao.......: " + cp.getVariacao());
//    }   
    
    private static void imprimir(List<Conta> lista) {
        for (Conta conta: lista) {
            imprimir(conta);
        }
    }
    
    private static void imprimir(Conta conta) {
        System.out.println("Dados da Conta "  + conta.getClass().getSimpleName());
        System.out.println("Numero.........: " + conta.getNumero());
        System.out.println("Data Abertura..: " + conta.getDataAbertura());
        System.out.println("Saldo..........: " + conta.getSaldo());
        //detalhes da conta corrente
        if (conta instanceof ContaCorrente) {
            System.out.println("Limite.........: " + ((ContaCorrente)conta).getLimite());
            System.out.println("Taxa de Juro...: " + ((ContaCorrente)conta).getTaxaJuro());
        } else {
        //detalhes da conta poupanca
            System.out.println("Dia Aniversario: " + ((ContaPoupanca)conta).getDiaAniversario());
            System.out.println("Variacao.......: " + ((ContaPoupanca)conta).getVariacao());
        }
        
    }
    
}
