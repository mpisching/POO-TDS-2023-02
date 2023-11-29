/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplopooestaticos;

import exemplopooestaticos.exceptions.FuncionarioException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mpisc
 */
public class ExemploPOOEstaticos {
    private static Connection connection;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = new int[5];
        Funcionario[] listaFuncionarios = new Funcionario[3];
        
        Funcionario.setAuxilioAlimentacao(300);
        
        System.out.println("Valor do auxilio alimentação: " + Funcionario.getAuxilioAlimentacao());
        Funcionario f1 = null, f2 = null, f3 = null;
        try {
            f1 = new Funcionario(1, "Fulano de Tal", 2000.0);
            f2 = new Funcionario(2, "Ciclano", -5000.0);
            f3 = new Funcionario(3, "Beltrano", 15000.0);
        } catch (FuncionarioException ex) {
            System.out.println("Mensagem: " + ex.getMessage());
        }

        try {        
            listaFuncionarios[0] = f1;
            listaFuncionarios[1] = f2;
            listaFuncionarios[2] = f3;
            listaFuncionarios[3] = null;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("O vetor não tem capacidade suficiente para armazenar o 4º elemento");
        } catch (Exception ex) {
            System.out.println("há uma falha...cuidado");
        } finally {
            System.out.println("Liberando recursos");
        }
        
        int x = 0;
        int y = 10;
        
        try {
            int r = y / x;
            System.out.println("R: " + r);
        } catch (ArithmeticException ex) {
            System.out.println("Divisão por zero é impossível.");
        }
        
        conectarBD();
         
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
    
    
    private static void conectarBD() {
        try {
            final String DRIVER = "com.mysql.cj.jdbc.driver";
            final String URL = "jdbc:mysql://localhost:3306/db_vendas?useTimezone=true&serverTimezone=UTC";
            final String USER = "root";
            final String PASS = "admin";
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexão realizada com sucesso!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver de bd não foi encontrado");
        } catch (SQLException ex) {
            System.out.println("Falha no acesso a BD, verifique os dados de acesso");
        } finally {
            System.out.println("Tentativa de conexão com o BD");
        }
           
        
    }
}
