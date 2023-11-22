/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplopooestaticos;

/**
 *
 * @author mpisc
 */
public class Funcionario {
    private int matricula;
    private String nome;
    private double salarioBase;
    private static double auxilioAlimentacao;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public static double getAuxilioAlimentacao() {
        return auxilioAlimentacao;
    }

    public static void setAuxilioAlimentacao(double auxAlimentacao) {
        auxilioAlimentacao = auxAlimentacao;
    }

    public Funcionario(int matricula, String nome, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
        
    }

    public Funcionario() {
    }
    
    public double calcularSalarioLiquido() {
        return salarioBase + auxilioAlimentacao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "matricula=" + matricula + ", nome=" + nome + ", salarioBase=" + salarioBase + ", SalarioLiquido=" + calcularSalarioLiquido() + '}';
    }
    
    
}
