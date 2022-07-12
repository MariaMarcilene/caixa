package br.com.bradesco.caixaeletronico;

import br.com.bradesco.caixaeletronico.services.SelecionaComando;

public class App {

    public static void main(String[] args) {
        System.out.println("Caixa eletrônico ligado!");
        SelecionaComando selecionaComando = new SelecionaComando();
        while (selecionaComando.executar()) {
            System.out.println("Executando um novo comando!");
        }

        System.out.println("Caixa eletrônico desligando!");
    }

}
