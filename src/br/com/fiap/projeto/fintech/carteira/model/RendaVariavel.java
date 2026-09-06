package model;

//Subclasse: RendaVariavel é um tipo de investimento (herança)
public class RendaVariavel extends Investimento {

    //Atributo proprio: variação do mercado (pode ser negativa)
    private double variacaoPercentual;

    //Construtor: super envia os dados comun; variação fica aqui
    public RendaVariavel(String nome, double valorAplicado, int prazoMeses, double variacaoPercentual) {
        super(nome, valorAplicado, prazoMeses);
        this.variacaoPercentual = variacaoPercentual;
    }

    //Polimorfismo: rentabilidade depende da variação de mercado
    @Override
    public double calcularRentabilidade() {
        return getValorAplicado() * (variacaoPercentual / 100.0);
    }

    //Polimorfismo: descrição específica
    @Override
    public String descrever() {
        String situacao;                         //declara vazia
        if (variacaoPercentual >= 0 ) {
            situacao = "valorização";           //se SIM
        } else {
            situacao = "desvalorização";        //se NÃO
        }
        return "Renda Variável " + getNome() + " | " + situacao + " de " + variacaoPercentual + "%";
    }

    //Getter e setters do atributo proprio

    public double getVariacaoPercentual() {
        return variacaoPercentual;
    }

    public void setVariacaoPercentual(double variacaoPercentual) {
        this.variacaoPercentual = variacaoPercentual;
    }
}
