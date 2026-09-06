# Projeto Fintech Carteira

Projeto acadêmico (FIAP - Fase 5, OOP) que simula uma **carteira de investimentos**,
aplicando os pilares da Programação Orientada a Objetos em Java.

## Conceitos aplicados
- **Herança**: `RendaFixa` e `RendaVariavel` herdam de `Investimento`.
- **Polimorfismo**: `calcularRentabilidade()` e `descrever()` têm comportamento
  próprio em cada subclasse.
- **Encapsulamento**: atributos privados com getters/setters.
- **Abstração**: `Investimento` é uma superclasse abstrata.
- **Associação**: `Carteira` tem um `Cliente` e vários `Investimento`.

## Estrutura
- `src/br/com/fiap/projeto/fintech/carteira/model` — classes de domínio (Cliente, Investimento, RendaFixa, RendaVariavel, Carteira)
- `src/br/com/fiap/projeto/fintech/carteira/view` — classe de execução (Main)

## Como rodar
Abra no IntelliJ e execute a classe `Main`. A saída mostra a descrição de cada
investimento, a rentabilidade individual e os totais da carteira.

## Exemplo de saída


```
==== Carteira de Maria ====

Renda Fixa CDB Banco X | taxa de 11.0% a.a.
Aplicado: R$ 5000.00 | Rentabilidade: R$ 1224.14 | Total: R$ 6224.14

Aplicado: R$ 3000.00 | Rentabilidade: R$ 255.00 | Total: R$ 3255.00

Rentabilidade total: R$ 1479.14
Patrimonio total: R$ 9479.14
```

## Autora

Jackelliny Ramos Durães — FIAP

