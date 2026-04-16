/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio9_10;

/**
 *
 * @author cacal
 */
public class Teste {
    public static void main(String args[]){
        ContaBancaria c1 = new ContaBancaria();
        c1.setTitular("Rodolfo");
        c1.setNumeroConta("554845178");
        c1.sacar(4200.0);
        c1.Info();
    }   
        
}
