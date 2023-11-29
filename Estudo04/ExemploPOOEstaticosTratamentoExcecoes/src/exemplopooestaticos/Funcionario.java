/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplopooestaticos;

import exemplopooestaticos.exceptions.FuncionarioException;

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

    public void setSalarioBase(double salarioBase) throws FuncionarioException {
        if (salarioBase >= 0.0) {
            this.salarioBase = salarioBase;
        } else {
            //System.out.println("O salário não pode ser negativo");
            this.salarioBase = 0.0;
            //lançamento de uma exceção
            throw new FuncionarioException("O salário não pode ser negativo");
        }
        
    }

    public static double getAuxilioAlimentacao() {
        return auxilioAlimentacao;
    }

    public static void setAuxilioAlimentacao(double auxAlimentacao) {
        auxilioAlimentacao = auxAlimentacao;
    }

    public Funcionario(int matricula, String nome, double salarioBase) throws FuncionarioException {
        this.matricula = matricula;
        this.nome = nome;
        this.setSalarioBase(salarioBase);
        
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
