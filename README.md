# ByteBank - Projeto com Strategy

## 📖 Descrição
Este projeto foi desenvolvido como parte do **Bootcamp Itaú - Java e Inteligência Artificial** na DIO.  
O objetivo é aplicar conceitos de **Padrões de Projeto (Design Patterns)** em Java, consolidando boas práticas de programação orientada a objetos.

Neste caso, foi utilizado o **padrão Strategy** para modelar diferentes operações bancárias (depósito e saque), tornando o código flexível e extensível para futuras operações.

---

## 🎯 Objetivos
- Implementar uma classe `Conta` que representa uma conta digital.
- Utilizar o **Strategy** para encapsular diferentes operações bancárias.
- Validar cenários de erro como:
  - Operação inválida
  - Valor menor ou igual a zero
  - Saque maior que o saldo disponível
- Imprimir mensagens claras de sucesso ou falha.

---

## 🛠 Estrutura do Projeto

## 📂 Descrição das Pastas e Arquivos

- **[Main.java](ca://s?q=Explicar_Main_java)** → Classe principal que lê a entrada, seleciona a estratégia e executa a operação.
- **[Conta.java](ca://s?q=Explicar_Conta_java)** → Representa a conta bancária com saldo inicial e métodos de acesso.
- **[OperacaoStrategy.java](ca://s?q=Explicar_OperacaoStrategy_java)** → Interface que define o contrato para operações bancárias.
- **[Deposito.java](ca://s?q=Explicar_Deposito_java)** → Implementa a lógica de depósito usando Strategy.
- **[Saque.java](ca://s?q=Explicar_Saque_java)** → Implementa a lógica de saque usando Strategy.

---

## 🚀 Evoluções Futuras
- Adicionar novas estratégias como **PIX** ou **Transferência**.
- Criar uma camada de **Factory** para instanciar diferentes tipos de conta.
- Implementar **Singleton** para gerenciar serviços centrais do banco.
- Adicionar testes automatizados com JUnit.


