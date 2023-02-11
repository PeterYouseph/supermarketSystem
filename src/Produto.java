abstract class Produto{
  private String nome; // Nome do produto
  private String marca; // Marca do produto
  private double preco; // Preço do produto (em R$)
  private double conteudo; // Conteudo do produto em sua unidade especifica
  private String unidade; // Em qual unidade de medida esta o produto (mL, L, kg, caixa)
  private int quantidade; // Quantidade disponivel desse produto no estoque

  public int hashCode() { // Calcula o HashCode do produto
    int hash = 1;
    hash = hash * 17 + (int) conteudo;
    hash = hash * 31 + marca.hashCode();
    hash = hash * 13 + nome.hashCode();
    return hash;
  }

  public boolean equals(Object obj) { //Regra de igualdade para dois produtos
    Produto prod = (Produto) obj;
    
    if (prod.nome.equals(this.nome) && prod.marca.equals(this.marca) && prod.preco == this.preco && prod.conteudo == this.conteudo)
      return true;
         
    else
      return false;
  }
  

  Produto(String nome, String marca, double preco, double conteudo, String unidade){ // Construtor
    this.nome = nome;
    this.marca = marca;
    this.preco = preco;
    this.conteudo = conteudo;
    this.unidade = unidade;
  }

  public void inserirNoEstoque(int num){
    quantidade += num;
  }

  public String getNome(){
    return nome;
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

  public double getConteudo(){
    return conteudo;
  }

  public String getUnid(){
    return unidade;
  }

  public abstract void imprimeInfo();
  public abstract double descontoClienteVip();
}