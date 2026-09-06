package model;

import java.util.ArrayList;
import java.util.List;

//Classe de associação: tem um cliente e varios investimentos
public class Carteira {

    //Atributos (associação "tem um"/ "tem muitos") entre classes
    private Cliente titular;
    private List<Investimento> investimentos;

    //Construtor: define o titular e cria a lista vazia
    public Carteira(Cliente titular) {
        this.titular = titular;
        this.investimentos = new ArrayList<>();
    }

    //Adciona um investimento (aceita qualquer subclasse - polimorfismo)
    public void adicionarInvestimento(Investimento investimento) {
        investimentos.add(investimento);
    }

    //Soma a rentabilidade de todos os investimento da carteira
    public double calcularRentabilidadeTotal() {
        double total = 0;
        for (int i = 0; i < investimentos.size(); i++) {
            total += investimentos.get(i).calcularRentabilidade();
        }
        return total;
    }

    //Soma o patrimônio total (valor aplicado + rentabilidade de cada um)
    public double calcularPatriminioTotal() {
        double total = 0;
        for (int i = 0; i < investimentos.size(); i++) {
            total += investimentos.get(i).calcularValorFinal();
        }
        return total;
    }

    //Getters

    public Cliente getTitular() {
        return titular;
    }

    public List<Investimento> getInvestimentos() {
        return investimentos;
    }
}
