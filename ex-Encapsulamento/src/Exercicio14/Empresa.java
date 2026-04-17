/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio14;

/**
 *
 * @author Admin
 */
public class Empresa {
    private String nome;
    private String CNPJ;
  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
   
 
    public void exibirInfo(){
    System.out.println("--- Dados empresariais ---");
    System.out.println("Nome da empresa: " + getNome());
    System.out.println("CNPJ: " + getCNPJ());

    }
    
    private void gerarelatorio(){
        System.out.println("Relatorio feito");
    }
}
