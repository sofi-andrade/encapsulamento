/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Equipementos.model;

/**
 *
 * @author Admin
 */
public class Equipamentos {
    private String nome;
    private String modelo;
    
    public Equipamentos(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void ExibirInfo(){
        System.out.println("---Cadastro de equpamentos---");
        System.out.println("Nome: " + getNome());
        System.out.println("Modelo: "+ getModelo());
    }
    
}
