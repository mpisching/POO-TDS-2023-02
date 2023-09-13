/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainapp;

import domain.Cor;
import domain.Marca;
import domain.Modelo;
import domain.Veiculo;


/**
 *
 * @author Gean Jair
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cor corTemp = new Cor();
        corTemp.setId(11);
        corTemp.setNome("Vermelha");
        
        Marca marca1 = new Marca();
        marca1.setNome("Chevrolet");
        marca1.setId(1);
        
        Modelo modelo1 = new Modelo();
        modelo1.setId(1);
        modelo1.setMarca(marca1);
        modelo1.setDescricao("Corsa");
  
        Cor cor1 = new Cor("Prata");
        cor1.setId(1);
        
        Veiculo v1 = new Veiculo();
        v1.setId(1);
        v1.setPlaca("ABC1234");
        v1.setObservacao("Carro de segunda mao");
        v1.setModelo(modelo1);
        v1.setCor(cor1);
        
        System.out.println("Dados do Veiculo \n"
                            + "Placa: " + v1.getPlaca() 
                            + "\nModelo: " + v1.getModelo().getDescricao() 
                            + "\nMarca: " + v1.getModelo().getMarca().getNome() 
                            + "\nCor: " + v1.getCor().getNome()
                            + "\nObservacao " + v1.getObservacao());
        
    }
    
}
