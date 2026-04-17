/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio11_12;

/**
 *
 * @author cacal
 */
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private boolean situacao = true; 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double calcularMedia(){
    return (nota1 + nota2) / 2;
    }
    
    public boolean  estaAprovado(){
        if(calcularMedia() >= 6){
         return situacao = true  ;
        }else{
            return situacao = false; 
    }}
    
    
    public void Info(){
    System.out.println("---- Gerenciamento de nota ----");
    System.out.println("Nome: " + getNome());
    if(nota2 >= 0 || nota1 <=10){
    System.out.println("Nota 1: " + getNota1());
    }else{
        System.out.println("nota infalida");
    }
    
    if(nota2 >= 0 || nota2 <= 10){
        System.out.println("Nota2: " + getNota2());
    }else{
        System.out.println("nota infalida");

    }
    System.out.println("Calculo da media: " + calcularMedia());
    if (situacao == true){
    System.out.println(" Reprovado Aprovado!");
    }
    else { 
    System.out.println("Aluno Reprovado.");        
   }
    }

   
}
