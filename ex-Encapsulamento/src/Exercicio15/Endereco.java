/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio15;

/**
 *
 * @author Admin
 */
public class Endereco {
     
    private String rua;
    private String bairro;
    private String cep;
    
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        
        this.cep = cep;
      
    }
    
    public void Info(){
    System.out.println("---- Validacao de CEP ----");
    
    System.out.println("Rua: " + this.getRua());
    System.out.println("Bairro: " + this.getBairro());
    
    if (getCep().matches("\\d{8}")){
        System.out.println("CEP:" + this.getCep());
    }else{
        System.out.println("CEP invalido!!");}
  
}}
