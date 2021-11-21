abstract class Produto {
  private String marca; // Marca do produto
  private double preco; // Preço do produto (em R$)
  private int conteudo; // Conteudo do produto em sua unidade especifica
  private int quantidade; // Quantidade disponivel desse produto no estoque
  private String unidade; // Em qual unidade de medida esta o produto (mL, L, kg, caixa)
  private String sigla; // Sigla para referenciar aquele tipo de produto(Ex: Refrigerante == REF)

  Produto(String marca, double preco, int conteudo, String unidade){ // Construtor
    this.marca = marca;
    this.preco = preco;
    this.conteudo = conteudo;
    this.unidade = unidade;
  }

  public void colocarNoEstoque(int num){
    quantidade += num;
  }

  public String getMarca(){
    return marca;
  }

  public double getPreco(){
    return preco;
  }

  public int getQuant(){
    return quantidade;
  }

  public int getConteudo(){
    return conteudo;
  }

  public String getUnid(){
    return unidade;
  }


  public abstract double descontoClienteVip();
  public abstract void imprimeInfo();
}