/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio13;

/**
 *
 * @author Admin
 */
public class ConfiguracoesSistema {
    protected String versaoSistema;
    
    
    public void setmostrarVersao(String versaoSistema){
        this.versaoSistema = versaoSistema;
  
    }
    
    public String getmostrarVersao (){
         return versaoSistema;
    
    }
    
    public void info(){
        System.out.println("--- Configuracao de sistema ---");
        System.out.println("Versao do sistema: " + getmostrarVersao());
     }
}
