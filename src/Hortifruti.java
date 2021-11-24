class Hortifruti extends Produto {
  private boolean ehOrganico;

  Hortifruti(String nome, String marca, double preco, double conteudo, String unidade, boolean ehOrg){
    super(nome, marca, preco, conteudo, unidade);
    ehOrganico = ehOrg;
  }
  
  public void imprimeInfo(){
    String aux = (ehOrganico)? "Orgânico" : "Não Orgânico";

    if(getConteudo() > 1)
      System.out.println(getNome() + ' '+ aux + " contendo " + getConteudo() + ' ' + getUnid() + " (R$" + getPreco()+ ')' + ": "+ getQuant() + " unidade(s)");

    else
      System.out.println(getNome() + ' ' + aux + " (R$" + getPreco()+ ')' + ": "+ getQuant() + " unidade(s)");

  }

  public double descontoClienteVip(){// Calcula o preco para o Cliente Vip
    return (0.75 * getPreco()); // Clientes Vip possuem desconto de 25% nas frutas, verduras e legumes
    
  }
}