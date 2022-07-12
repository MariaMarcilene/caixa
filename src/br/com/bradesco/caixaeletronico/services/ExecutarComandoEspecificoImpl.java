package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.repository.MemoriaContaRepository;

public class ExecutarComandoEspecificoImpl implements ExecutarComandoEspecifico {

    private final Deposito deposito;
    private final Saque saque;

    private final AbrirConta abrirConta;

   public ExecutarComandoEspecificoImpl() {
       MemoriaContaRepository repository = new MemoriaContaRepository();
       this.deposito = new DepositoImpl(repository);
       this.saque = new SaqueImpl();
       this.abrirConta = new AbrirContaImpl(repository);
   }


    @Override
    public boolean execute(int comando) {
        boolean resultado = true;
        //Scanner entrada = new Scanner(System.in);

        if (comando == 0) {
            System.out.println("Encerrando o programa");
            resultado = false;

        } else if (comando == 1) {
            saque.execute(100.0, 11);
            System.out.println("Sacando dinheiro");

        } else if (comando == 2) {
            this.deposito.execute(10.0, 1);
            System.out.println("Depositando dinheiro");

        }else if (comando == 3)  {
            System.out.println("");
        } else {
            System.out.println("Comando inválido!");

        }

        return resultado;
    }
}
