/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mpisc
 */
public class Categoria {
    private int id;
    private String descricao;
    
    //métodos construtores de classe
    //sobrecarga de métodos construtores - Overloading
    public Categoria(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Categoria(int id) {
        this.id = id;
    }

    public Categoria() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", descricao=" + descricao + '}';
    }
    
}
