package model;

//Classe de associação: representa o dono da carteira (não entra herança)
public class Cliente {

   //Atributos privados (encapsulamento)
   private String nome;
   private String cpf;
   private String email;

    //Construtor: inicializa o cliente com seus dados
    public Cliente(String nome, String cpf, String email) {
       this.nome = nome;
       this.cpf = cpf;
       this.email = email;
    }

    //Getter e setters: acesso controlado aos atributos

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getCpf() {
      return cpf;
   }

   public void setCpf(String cpf) {
      this.cpf = cpf;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
}
