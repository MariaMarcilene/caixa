package br.com.bradesco.caixaeletronico.services;

public class ListarComandosImpl implements ListarComandos {

    @Override
    public int execute() {
        System.out.println("Prezado(a), digite a opção desejada: ");
        System.out.println("0 para Sair");
        System.out.println("1 para Saque");
        System.out.println("2 para Depósito");
        System.out.println("3 para Abrir conta");
        return 0;
    }
}
