/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio13;

/**
 *
 * @author Admin
 */
public class Teste {
    public static void main(String args[]){
        SubSistema s1 = new SubSistema();
        ConfiguracoesSistema s2 = new ConfiguracoesSistema();
        s2.setmostrarVersao("2.10, 2 , Windows");
        s1.setmostrarVersao("1. 21,1, Windows");
        s2.info();
        s1.info();
    
    }
}
