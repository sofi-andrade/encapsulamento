/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio9_10;

/**
 *
 * @author cacal
 */
public class ContaBancaria {

    private String numeroConta;
    private double saldo = 4000.0;
    private String titular;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double deposito) {
        saldo += deposito;
        System.out.println("---- Status de deposito ----");
        System.out.println("Deposito feito no valor de: RS " + deposito);
    }

    public void sacar(double saque) {
        System.out.println("---- Status do saque ----"); 
        if (saldo >= saque) {
            this.saldo -= saque;
           
            System.out.println("- Saque de: R$ " + saque + " realizado com sucesso!!  \n ");
        } else {
            System.out.print("Saldo insuficiente!!  \n ");

        }

    }

    public void Info() {
        System.out.println("---- Gerenciamento de Conta ----");
        System.out.println("Numero da Conta: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Titular: " + getTitular());
    }
}
