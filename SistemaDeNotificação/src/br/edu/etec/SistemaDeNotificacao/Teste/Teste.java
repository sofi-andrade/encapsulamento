/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaDeNotificacao.Teste;

import br.edu.etec.SistemaDeNotificacao.Model.Email;
import br.edu.etec.SistemaDeNotificacao.Model.Notificacao;
import br.edu.etec.SistemaDeNotificacao.Model.Sms;



/**
 *
 * @author cacal
 */
public class Teste {
    public static void main(String args []){
        Notificacao n1 = new Email("Carlos", "grebfe"); 
        Notificacao n2 = new Sms("Bruna", "olá boa noite ");
        
        n1.info();
        n1.enviar();
        n2.info();
        n2.enviar();
    }
}
