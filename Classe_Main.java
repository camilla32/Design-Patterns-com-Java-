package br.com.itau.bytebank;

import java.util.Scanner;
import br.com.itau.bytebank.conta.Conta;
import br.com.itau.bytebank.strategy.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operacao = scanner.nextLine().trim();
        int saldoInicial = Integer.parseInt(scanner.nextLine().trim());
        int valorOperacao = Integer.parseInt(scanner.nextLine().trim());

        Conta conta = new Conta(saldoInicial);
        OperacaoStrategy strategy = null;

        if ("DEPOSITO".equals(operacao)) {
            strategy = new Deposito();
        } else if ("SAQUE".equals(operacao)) {
            strategy = new Saque();
        } else {
            System.out.println("Erro: operacao invalida");
        }

        if (strategy != null) {
            boolean sucesso = strategy.executar(conta, valorOperacao);
            if (sucesso) {
                System.out.println("Saldo final: " + conta.getSaldo());
            }
        }

        scanner.close();
    }
}
