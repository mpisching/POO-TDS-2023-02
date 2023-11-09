/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public abstract class Conta {
    private int numero;
    private float saldo;
    private String dataAbertura;

    public Conta(int numero, float saldo, String dataAbertura) {
        this.numero = numero;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public Conta() {
    }
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return "Conta{" + "numero=" + numero + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + '}';
    }
    
    
}
