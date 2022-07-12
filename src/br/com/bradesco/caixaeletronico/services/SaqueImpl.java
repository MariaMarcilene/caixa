package br.com.bradesco.caixaeletronico.services;

public class SaqueImpl implements Saque {

    @Override
    public double execute(double valor, int numeroDaConta) {
        System.out.println("Sacando: " + valor);
        System.out.println("Numero da Conta: " + numeroDaConta);

        return valor;
    }

}
