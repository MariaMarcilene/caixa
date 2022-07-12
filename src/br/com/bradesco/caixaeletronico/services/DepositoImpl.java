package br.com.bradesco.caixaeletronico.services;

public class DepositoImpl implements Deposito {

    private final MemoriaContaRepository repository;

    public DepositoImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(double valor, int numeroDaConta)  {

        Conta conta = repository.find
        System.out.println("Depositando: " + valor);
        System.out.println("Numero da Conta: " + numeroDaConta);
    }

}
