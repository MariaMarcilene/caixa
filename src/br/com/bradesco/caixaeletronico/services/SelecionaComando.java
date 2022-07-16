package br.com.bradesco.caixaeletronico.services;

public class SelecionaComando {

    // private = não mostra fora da classe;
    // final = apenas usa, não altera o valor;

    // Variáveis
    private final ListarComandos listarComandos;
    private final ObtemComando obtemComando;
    private final ExecutarComandoEspecifico executarComandoEspecifico;


    // Construtor
    public SelecionaComando() {
        this.listarComandos = new ListarComandosImpl();
        this.obtemComando = new ObtemComandoImpl();
        this.executarComandoEspecifico = new ExecutarComandoEspecificoImpl();
    }


    public boolean executar() {
        listarComandos.execute();
        int comando = obtemComando.execute();
        return executarComandoEspecifico.execute(comando);
    }
}
