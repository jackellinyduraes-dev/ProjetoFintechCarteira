package view;

import br.com.fiap.projeto.fintech.carteira.model.Carteira;
import br.com.fiap.projeto.fintech.carteira.model.Cliente;
import br.com.fiap.projeto.fintech.carteira.model.RendaFixa;
import br.com.fiap.projeto.fintech.carteira.model.RendaVariavel;

//Classe de execução: inicia o programa e testa as classes
public class Main {
    public static void main(String[] args) {
        //Cria o cliente titular da carteira
        Cliente cliente = new Cliente("Maria", "123.456.789-00", "maria.a@gamil.com");


        //Instanciando duas classes e define valores nos atributos
        RendaFixa cdb = new RendaFixa("CDB Banco X", 5000.0, 24, 0.11);
        RendaVariavel acoes = new RendaVariavel("Ações Empresa Y", 3000.0, 24, 8.5);

        //Cria a carteira e adciona os investimentos
        Carteira carteira = new Carteira(cliente);
        carteira.adicionarInvestimento(cdb);
        carteira.adicionarInvestimento(acoes);

        //Invoca os métodos

        //Cabeçalho
        System.out.println("==== Carteira de " + cliente.getNome() + " ====\n");

        //Exibe os dados da renda fixa
        System.out.println(cdb.descrever());
        System.out.printf("Aprincado: R$ %.2f | Rentabilidade: R$ %.2f | Total: R$ %.2f%n%n", cdb.getValorAplicado(),
                cdb.calcularRentabilidade(), cdb.calcularValorFinal());

        //Exibe os dados da renda varíavel
        System.out.printf("Aplicado: R$ %.2f | Rentabilidade: R$ %.2f | Total: R$ %.2f%n%", acoes.getValorAplicado()
                , acoes.calcularRentabilidade(), acoes.calcularValorFinal());

        //Exibe os totais da carteira
        System.out.printf("Rentabilidade total: R$ %.2f%n", carteira.calcularRentabilidadeTotal());
        System.out.printf("Patrimonio total: R$ %.2f%n", carteira.calcularPatriminioTotal());
    }

}