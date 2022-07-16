package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutarComandoEspecificoImpl implements ExecutarComandoEspecifico {

    // Variáveis
    private final Deposito deposito;
    private final Saque saque;
    private final AbrirConta abrirConta;


    // Construtor
    public ExecutarComandoEspecificoImpl() {
        MemoriaContaRepository repository = new MemoriaContaRepository();
        this.deposito = new DepositoImpl(repository);
        this.saque = new SaqueImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
    }


    @Override
    public boolean execute(int comando) {
        boolean resultado = true;
        Scanner entrada = new Scanner(System.in);

        if (comando == 0) {
            System.out.println("Encerrando o programa");
            resultado = false;

        } else if (comando == 1) {
            System.out.println("Digite o número da conta: ");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor a ser sacado: ");
            double valor = entrada.nextInt();

            this.saque.execute(valor, numero);
            System.out.println("Sacando dinheiro");

        } else if (comando == 2) {
            System.out.println("Digite o número da conta: ");
            int numero = entrada.nextInt();

            System.out.println("Digite o valor a ser depositado: ");
            double valor = entrada.nextInt();

            this.deposito.execute(valor, numero);
            System.out.println("Depositando dinheiro");

        } else if (comando == 3) {
            abrirConta.execute();
            System.out.println("Abrindo conta");

        } else {
            System.out.println("Comando inválido!");
        }

        return resultado;
    }
}


//    @Override
//    public boolean execute(int comando) {
//        boolean resultado = true;
//
//        switch (comando) {
//            case 0:
//                System.out.println("Encerrando o programa");
//                resultado = false;
//                break;
//
//            case 1:
//                System.out.println("Sacando dinheiro");
//                break;
//
//            case 2:
//                System.out.println("Depositando dinheiro");
//                break;
//
//            default:
//                System.out.println("Comando inválido!");
//                break;
//        }
//
//        return resultado;
//    }
//}
