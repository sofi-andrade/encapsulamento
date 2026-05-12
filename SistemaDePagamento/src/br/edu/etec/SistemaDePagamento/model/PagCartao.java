/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaDePagamento.model;

/**
 *
 * @author cacal
 */
public class PagCartao extends Pagamento{
    
    private String numCartao;
    
    public PagCartao(Double valor, String numCartao) {
        super(valor);
        this.numCartao = numCartao; 
    }
    
    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }
   
    @Override
    public void processarPagamento() {
        
          if (getValor() > 0) {
            status = StatusPagamento.CONCLUIDO; 
        } else {
            status = StatusPagamento.FALHA;
        }
          
    }
    @Override
    public void ExibirStatus() {
        System.out.println("----SISTEMA DE PAGAMENTO----");
        if (getValor() > 0) {
            System.out.println("Nº Cartao: " + getNumCartao());
            System.out.println("Status do pagamento: " + status + "\n");

        } else {
            System.out.println("Nº Cartao: " + getNumCartao());
            System.out.println("falha no pagamento!! Pagamento pendente!!");
            System.out.println("Status do pagamento: " + status + "\n");
        }

    }
}

