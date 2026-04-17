/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio13;

/**
 *
 * @author Admin
 */
public class SubSistema extends ConfiguracoesSistema {
    

    @Override
    public void info(){
        System.out.println("--- Configuracao do subsitema ---");
        System.out.println("Versao do sistema: " + this.versaoSistema);
     }
    
}
