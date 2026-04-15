package Exercicio1_2Pessoa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Pessoa {
   private String nome;
   private int idade;
   private String cpf;
   
  
   public void setNome(String nome){
       this.nome = nome; 
       
   }
   public String getNome(){
       return nome;
       
   }
   public void setIdade(int idade){
       if(idade > 0){
           this.idade = idade;
       }else{
           this.idade = 0; 
       }
   }
   public int getIdade(){
       return idade; 
   }
   public void setCpf(String cpf){
       this.cpf = cpf;
   }
   public String getCpf(){
       return cpf; 
   }
   public void info(){
       System.out.println("------Informacao ------");
       System.out.println("Nome: "+ getNome());
       if (getIdade() <=0){
           System.out.println("Idade invalida");
       }else{
       System.out.println("Idade: " + getIdade());
       }
       System.out.println("CPF: " + getCpf());
   }
       
}
