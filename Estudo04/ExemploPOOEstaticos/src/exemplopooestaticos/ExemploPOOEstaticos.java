/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplopooestaticos;

/**
 *
 * @author mpisc
 */
public class ExemploPOOEstaticos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario.setAuxilioAlimentacao(300);
        
        System.out.println("Valor do auxilio alimentação: " + Funcionario.getAuxilioAlimentacao());
        
        Funcionario f1 = new Funcionario(1, "Fulano de Tal", 2000.0);
        Funcionario f2 = new Funcionario(2, "Ciclano", 5000.0);
        Funcionario f3 = new Funcionario(3, "Beltrano", 15000.0);
        
        System.out.println("Dados dos funcionarios antes do reajuste do auxilio alimentacao ");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        Funcionario.setAuxilioAlimentacao(400);
        System.out.println("Dados dos funcionarios após o reajuste do auxilio alimentacao ");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
    
}
