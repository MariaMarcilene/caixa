package br.com.bradesco.caixaeletronico.services;

import br.com.bradesco.caixaeletronico.model.Conta;

public interface Transferencia {

    void transferir(double valor, Conta numeroContaDestino, Conta origem);

}
