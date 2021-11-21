class Bebida extends Produto {
  private String tipo; // Tipo da Bebida (Refrigerante, cerveja, água com gás, etc...)

  Bebida(String tipo, String marca, double preco, int conteudo, String unidade){ // Construtor
    super(marca, preco, conteudo, unidade);
    this.tipo = tipo;
  }

  public String getTipo(){
    return tipo;
  }

  public double descontoClienteVip(){ // Calcula o preco para o Cliente Vip
    return (0.85 * getPreco()); // Clientes Vip possuem desconto de 15% nas bebidas
  }

  public void imprimeInfo(){
    System.out.println(getTipo() + ' ' + getMarca() + ' ' + getConteudo() + ' ' + getUnid() +": "+ getQuant() + " unidade(s)");
  }

 
}