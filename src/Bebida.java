class Bebida extends Produto {
  private String sabor;
  private static final String setor = "Bebidas";

  Bebida(String nome, String marca, String sabor, double preco, double conteudo, String unidade){ // Construtor
    super(nome, marca, preco, conteudo, unidade);
    this.sabor = sabor;
  }

  public String getSabor(){
    return sabor;
  }

  public double descontoClienteVip(){ // Calcula o preco para o Cliente Vip
    return (0.85 * getPreco()); // Clientes Vip possuem desconto de 15% nas bebidas
  }

  public void imprimeInfo(){
    System.out.println(getNome() + ' '+ getMarca() + " Sabor " + getSabor() +' ' + getConteudo() + ' ' + getUnid() + " (R$" + getPreco()+ ')' + ": "+ getQuant() + " unidade(s)");
  }
}