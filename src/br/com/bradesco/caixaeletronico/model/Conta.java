package br.com.bradesco.caixaeletronico.model;

public class Conta {

    private int numeroDaConta;
    private double saldo;


    // Construtor
    public Conta() {
        saldo = 0;
    }


    // Get e Set
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    // Get
    public double getSaldo() {
        return saldo;
    }


    // Métodos
    public void adicionaSaldo(double valor) {
        saldo = saldo + valor;
    }

    public boolean retirarSaldo(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }
}
