package model;

//Superclasse abstrata: base de todos os investimentos (não instanciavel)
public abstract class Investimento {

    //Atributos comuns a todos os investimentos (encapsulamento)
    private String nome;
    private double valorAplicado;
    private int prazoMeses;

    //Contrutor da superclasse (chamado pelas subclasses via super)
    public Investimento(String nome, double valorAplicado, int prazoMeses) {
        this.nome = nome;
        this.valorAplicado = valorAplicado;
        this.prazoMeses = prazoMeses;
    }

    //Método abstrato: cada subclasse calcula a rentabilidade do seu jeito
    public abstract double calcularRentabilidade();

    //Método abstrato: cada subclasse se descreve do seu jeito
    public abstract String descrever();

    //Valor final = aplicado + rentabilidade (usa o método polimórfico)
    public double calcularValorFinal() {
        return valorAplicado + calcularRentabilidade();
    }

    //Getter e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public int getPrazoMeses() {
        return prazoMeses;
    }

    public void setPrazoMeses(int prazoMeses) {
        this.prazoMeses = prazoMeses;
    }
}
