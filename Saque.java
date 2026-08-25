package br.com.itau.bytebank.strategy;

import br.com.itau.bytebank.conta.Conta;

public class Saque implements OperacaoStrategy {
    @Override
    public boolean executar(Conta conta, int valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor invalido");
            return false;
        }
        if (valor > conta.getSaldo()) {
            System.out.println("Erro: saldo insuficiente");
            return false;
        }
        conta.setSaldo(conta.getSaldo() - valor);
        return true;
    }
}
