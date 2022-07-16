package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;
import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class SaqueImpl implements Saque {

    private final MemoriaContaRepository repository;

    public SaqueImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }


    @Override
    public double execute(double valor, int numeroDaConta) {

        Conta conta;
        conta = repository.findById(numeroDaConta);
        conta.retirarSaldo(valor);

        System.out.println("Sacando: " + valor);
        System.out.println("Numero da Conta: " + numeroDaConta);
        System.out.printf("O saldo resultante é de R$ %.2f. %n", conta.getSaldo());

        return valor;
    }
}


//    if (valor >= 1000) {
//        System.out.println("Limite de saque excedido");
//    } else if (valor <= 900.00) {
//        System.out.printf ("%s, você sacou: " + valor, "reais");
//    } else {
//        System.out.println("Opção inválida");
//    }
//
//    return valor;

