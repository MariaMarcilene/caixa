package br.com.bradesco.caixaeletronico.services;

public class SelecionaComando {

    private final ListarComandos listarComandos;
    private final ObtemComando obtemComando;
    private final ExecutarComandoEspecifico executarComandoEspecifico;

    public SelecionaComando() {
        this.listarComandos = new ListarComandosImpl();
        this.obtemComando = new ObtemComandoImpl();
        this.executarComandoEspecifico = new ExecutarComandoEspecificoImpl();

    }

    public boolean executar() {
        listarComandos.execute();
        //imprimeListaComandos();
        int comando = obtemComando.execute();
        return executarComandoEspecifico.execute(comando);

    }

    //private void imprimeListaComandos() { }

//    private int obtemComando() {
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Digite sua escolha: ");
//        int escolha = entrada.nextInt();
//        return escolha;
//    }

//    private boolean executaComandoEspecifico(int comando) {
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
//        return resultado;}

}
