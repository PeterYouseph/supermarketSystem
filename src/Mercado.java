class Mercado {
  private String nome;
  protected Setor[] setores = new Setor[10];
  private int numSetores;

  Mercado(String nome){
    this.nome = nome;
    setores[0] = new Setor("Bebidas");
    setores[1] = new Setor("Hortifruti");
    setores[2] = new Setor("Açougue");
    setores[3] = new Setor("Limpeza");
    setores[4] = new Setor("Higiene Pessoal");
    numSetores = 5;
  }

  public void inserirSetor(String nomeSetor){
    setores[numSetores] = new Setor(nomeSetor);
  }

  public void imprimeSetores(){
    System.out.println(setores);
  }


}