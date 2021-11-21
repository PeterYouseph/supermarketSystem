class Limpeza extends Produto {
  private String tipo;

  Limpeza(String tipo, String marca, int preco, int conteudo, String unidade){
    super(marca, preco, conteudo, unidade);
    this.tipo = tipo;
  }

  public double descontoClienteVip(){ // Calcula o preco para o Cliente Vip
    return(0.90 * getPreco()); // Clientes Vip possuem 10% de desconto em produtos de Limpeza
  }

  
}