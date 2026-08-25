package br.com.itau.bytebank.strategy;

public interface OperacaoStrategy {
    boolean executar(br.com.itau.bytebank.conta.Conta conta, int valor);
}
