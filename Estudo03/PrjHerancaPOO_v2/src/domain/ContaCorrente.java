/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class ContaCorrente extends Conta {
    private float limite;
    private float taxaJuro;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getTaxaJuro() {
        return taxaJuro;
    }

    public void setTaxaJuro(float taxaJuro) {
        this.taxaJuro = taxaJuro;
    }
    
    @Override
    public String toString() {
        String str = super.toString();
        return str + "\nContaCorrente{" + "limite=" + limite + ", taxaJuro=" + taxaJuro + '}';
    }
    
}
