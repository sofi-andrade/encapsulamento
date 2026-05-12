package br.edu.etec.SistemaDePagamento.teste;

import br.edu.etec.SistemaDePagamento.model.PagCartao;
import br.edu.etec.SistemaDePagamento.model.Pagamento;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Teste {
  public static void main (String args[]){
      Pagamento pag = new PagCartao(7.0, "0001235");
      Pagamento pag2 = new PagCartao(0.0, "8787879");
      pag.ExibirStatus();
      pag.processarPagamento();
      pag.ExibirStatus();
      
      pag2.processarPagamento();
      pag2.ExibirStatus();
      
  }  
}
