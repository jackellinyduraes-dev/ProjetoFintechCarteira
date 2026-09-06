package model;

//Subclasse: RendaFixa é um tipo de investimento (herança)
public class RendaFixa extends Investimento {

    //Atributo proprio da renda fixa
    private double taxaAnual;

    //Construtor: super envia os dados comuns: taxaAnual fica aqui
    public RendaFixa(String nome, double valorAplicado, int prazoMeses, double taxaAnual) {
        super(nome, valorAplicado, prazoMeses);
        this.taxaAnual = taxaAnual;
    }

    //Polimorfismo: rentabilidade por juros simples (valor x taxa x tempo)
    @Override
    public double calcularRentabilidade() {
       double montante = getValorAplicado();
       double taxaMensal = taxaAnual / 12;                      //Taxa por mês
       for (int i = 0; i < getPrazoMeses(); i++) {
           montante = montante * (1 * taxaMensal);              //Renda a cada mês
       }
       return montante - getValorAplicado();                    //Só o ganho
    }

    //Polimorfismo: descrição espesífica da renda fixa
    @Override
    public String descrever() {
        return "Renda Fixa " + getNome() + " | taxa de " + (taxaAnual * 100) + "% a.a.";
    }

    //Getter e setters do atributo proprio

    public double getTaxaAnual() {
        return taxaAnual;
    }

    public void setTaxaAnual(double taxaAnual) {
        this.taxaAnual = taxaAnual;
    }
}
