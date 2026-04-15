/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio5;

/**
 *
 * @author cacal
 */
public class relogio {
   int minuto;

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(minuto>=0 && minuto <=60){
        this.minuto = minuto;
    }else{
       this.minuto = -1;
    }}
   
    public void Info(){
    System.out.println("---- Relogio ----");
    if (getMinuto()>=0 && getMinuto() < 60){
    System.out.println("Minuto: "+ getMinuto());
    }
    else{
    System.out.println("Minuto invalido!");
    }}
}
