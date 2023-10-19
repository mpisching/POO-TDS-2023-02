/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private int variacao;
    /*isso é a relação por associação de classes
     Neste contexto é incorreto dizer que ContaPoupanca possui        uma Conta
    ContaPoupanca herda de Conta, por isso a relação se
    a por meio da palavra reservada extends*/
    //private Conta conta;
    
    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public int getVariacao() {
        return variacao;
    }

    public void setVariacao(int variacao) {
        this.variacao = variacao;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return str + "\nContaPoupanca{" + "diaAniversario=" + diaAniversario + ", variacao=" + variacao + '}';
    }
    
    
}
