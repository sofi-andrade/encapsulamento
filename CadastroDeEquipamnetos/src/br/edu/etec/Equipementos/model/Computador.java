/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Equipementos.model;

/**
 *
 * @author Admin
 */
public class Computador extends Equipamentos {
    private String processador;
    
    public Computador(String nome, String modelo,String processador ) {
        super(nome, modelo);
        this.processador = processador; 
    }
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
    
    
    @Override
    public void ExibirInfo(){
        System.out.println("---Cadastro de equpamentos---");
        System.out.println("Nome: " + getNome());
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Processador: "+ getProcessador());
    }
}
