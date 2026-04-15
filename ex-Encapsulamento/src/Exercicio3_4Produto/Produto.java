package Exercicio3_4Produto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cacal
 */
public class Produto {

    private String nomeProduto;
    private double preco;
    private int quant;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0){
        this.preco = preco;
    }else{
        this.preco = 0;     
        }
    }
    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        
        this.quant = quant;
    }

    public void setNomeProduto(String nome) {
        this.nomeProduto = nome;
    }

    public String getNomeProduto() {
        return nomeProduto;

    }

    public void info() {
        System.out.println("---- Infirmaçãoes Produto ----");
        System.out.println("Nome: " + getNomeProduto());
        if (getPreco() <= 0){
            System.out.println("Preco invalido!!, Digite novamente");
        }else{
            System.out.println("Preco: " + getPreco() );
        }
        System.out.println("Quantidade: " + getQuant());

    }

}
