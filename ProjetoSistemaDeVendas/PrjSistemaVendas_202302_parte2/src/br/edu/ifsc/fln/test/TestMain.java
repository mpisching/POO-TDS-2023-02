/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsc.fln.test;

import br.edu.ifsc.fln.model.domain.ESituacao;

/**
 *
 * @author mpisc
 */
public class TestMain {
    public static void main(String[] args) {
        ESituacao situacao = ESituacao.ATIVO;
        System.out.println("Situacao: " + situacao.toString());
    }
}
