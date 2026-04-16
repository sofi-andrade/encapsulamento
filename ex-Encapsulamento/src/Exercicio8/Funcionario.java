/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio8;

/**
 *
 * @author cacal
 */
public class Funcionario {
      private String nome;
    private double salario;
    private String cargo;

    
    
     public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setSalario(double salario) {
        if(salario >= 1412.00){
        this.salario = salario;}
        else{
        this.salario = 0;
        }
    }
    
    public double getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getCargo() {
        return cargo;
    }


    public void Info(){
    System.out.println("----- Gerenciamento de funcionario -----");
    System.out.println("Nome: " + getNome());
    if (getSalario()>= 1412.00){
    System.out.println("Salario: " + getSalario());}
    else{
    System.out.println("Salario abaixo do salário mínimo vigente!!");
    }
    System.out.println("Cargo: " + getCargo());
    }
}
