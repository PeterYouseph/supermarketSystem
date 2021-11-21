class Setor {
  private String nomeSetor; // Nome do Setor (Bebidas, Horitifruti, etc...)
  private int numProdutos; // Num de produtos diferentes presentes neste setor
  private Produto[] vecProdutos; // Vetor contendo os produtos que estao no setor

  Setor(String nome, int numProd, Produto[] produtos){
    nomeSetor = nome;
    numProdutos = numProd;
    vecProdutos = produtos;
  }

  public String getNome(){
    return nomeSetor;
  }

  public void imprimeEstoque(){
    System.out.println("Estoque do setor de " + nomeSetor + ":");
    for(int i = 0; i < numProdutos; i++){
      System.out.print("(" + (i+1) + ") ");
      vecProdutos[i].imprimeInfo();
    }
  }

}