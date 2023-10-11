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
