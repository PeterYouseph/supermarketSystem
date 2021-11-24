import java.util.*;

class Setor {
  private String nomeSetor; // Nome do Setor (Bebidas, Horitifruti, etc...)
  private int numProdutos; // Num de produtos diferentes presentes neste setor
  private Set<Produto> setProdutos; // Vetor contendo os produtos que estao no setor

  Setor(String nome){
    nomeSetor = nome;
    numProdutos = 0;
    setProdutos = new HashSet<Produto>();
  }

  public String getNome(){
    return nomeSetor;
  }

  public int getNumProdutos(){
    return numProdutos;
  }

  public void imprimeEstoque(){
    System.out.println("Estoque do setor de " + nomeSetor + ":");
    for(Produto p: setProdutos){
      p.imprimeInfo();
    }
  }

  public void novoProduto(){
    switch(nomeSetor){
      case "Bebidas":
        novaBebida();
      break;

      case "Hortifruti":
        novaFruta();
      break;

      case "Açougue":
        novaCarne();
      break;

      case "Limpeza":
        novaLimpeza();
      break;

      case "Higiene Pessoal":
        novaHigiene();
      break;

    }
    
    numProdutos++;

  } 


  private void novaBebida(){
    Scanner scan = new Scanner(System.in);

    String nomeAux, marcaAux, saborAux, uniAux;
    double precoAux, contAux;
    int numAux;

    System.out.println("Registrando no Estoque um novo produto do tipo Bebida");
    System.out.println("Insira, na seguinte ordem:\n(1)- Nome da Bebida\n(2)- Marca\n(3)- Sabor\n(4)- Preço\n(5)- Conteúdo\n(6)- Unidade (ml, L, g, Kg ...)");

    nomeAux = scan.next();
    marcaAux = scan.next();
    saborAux = scan.next();
    precoAux = scan.nextDouble();
    contAux = scan.nextDouble();
    uniAux = scan.next();

    Produto p = new Bebida(nomeAux, marcaAux, saborAux, precoAux, contAux, uniAux);

    System.out.print("Deseja inserir quantas unidades desse produto no estoque ? ");

    numAux = scan.nextInt();

    p.inserirNoEstoque(numAux);
    System.out.println();

    p.imprimeInfo();

    setProdutos.add(p);

    System.out.println("Novo produto registrado com sucesso!\n");
  }

  private void novaFruta(){
    Scanner scan = new Scanner(System.in);

    String nomeAux, marcaAux, uniAux;
    double precoAux, contAux;
    int numAux;
    boolean orgAux;

    System.out.println("Registrando um novo produto no Estoque de Hortifruti");
    System.out.println("Insira, na seguinte ordem:");
    System.out.println("(1)- Nome da Fruta, Verdura, ou Legume");
    System.out.println("(2)- Preço");
    System.out.println("(3)- Conteudo (1 caso seja um produto avulso ou um num inteiro n caso seja uma caixa ou um saco com n frutas");
    System.out.println("(4)- É um produto orgânico ?  1- Sim; 2- Não");

    nomeAux = scan.next();
    precoAux = scan.nextDouble();
    contAux = scan.nextDouble();
    numAux = scan.nextInt();

    orgAux = (numAux == 1) ? true : false; 

    Produto p = new Hortifruti(nomeAux, " ", precoAux, contAux, "unidade(s)" , orgAux);

    setProdutos.add(p);

    System.out.print("Deseja inserir quantas unidades desse produto no estoque ? ");

    numAux = scan.nextInt();

    p.inserirNoEstoque(numAux);
    System.out.println();

    p.imprimeInfo();

    System.out.println("Novo produto registrado com sucesso!\n");
  }

  private void novaLimpeza(){
    Scanner scan = new Scanner(System.in);

    String nomeAux, marcaAux, uniAux;
    double precoAux, contAux;
    int numAux;

    System.out.println("Registrando um novo produto no Estoque de Produtos de Limpeza");
    System.out.println("Insira, na seguinte ordem:");
    System.out.println("(1)- Nome do Produto (ex: SabãoEmPó, Detergente...");
    System.out.println("(2)- Marca do Produto");
    System.out.println("(3)- Preço");
    System.out.println("(4)- Conteudo");
    System.out.println("(5)- Unidade (ml, L, g, Kg ...)");

    nomeAux = scan.next();
    marcaAux = scan.next();
    precoAux = scan.nextDouble();
    contAux = scan.nextDouble();
    uniAux = scan.next();

    Produto p = new Limpeza(nomeAux, marcaAux, precoAux, contAux, uniAux);

    setProdutos.add(p);

    System.out.print("Deseja inserir quantas unidades desse produto no estoque ? ");

    numAux = scan.nextInt();

    p.inserirNoEstoque(numAux);
    System.out.println();
    p.imprimeInfo();

    System.out.println("Novo produto registrado com sucesso!\n");
  }

  private void novaCarne(){
    Scanner scan = new Scanner(System.in);

    String nomeAux, marcaAux;
    double precoAux, contAux;
    int numAux;

    System.out.println("Registrando um novo produto no Açougue");
    System.out.println("Insira, na seguinte ordem:");
    System.out.println("(1)- Corte da carne (ex: CochãoDuro, FileMignon, Picanaha..");
    System.out.println("(2)- Tipo da Carne (ex: Bovino(a), Suíno(a)...");
    System.out.println("(3)- Preço");
    System.out.println("(4)- Peso em Kg");
  

    nomeAux = scan.next();
    marcaAux = scan.next();
    precoAux = scan.nextDouble();
    contAux = scan.nextDouble();

    Produto p = new Carne(nomeAux, marcaAux, precoAux, contAux, "Kg");

    setProdutos.add(p);

    System.out.print("Deseja inserir quantas unidades desse produto no estoque ? ");

    numAux = scan.nextInt();

    p.inserirNoEstoque(numAux);
    System.out.println();
    p.imprimeInfo();

    System.out.println("Novo produto registrado com sucesso!\n");
  }

    private void novaHigiene(){
    Scanner scan = new Scanner(System.in);

    String nomeAux, marcaAux, uniAux;
    double precoAux, contAux;
    int numAux;

    System.out.println("Registrando um novo produto no Estoque de Produtos de Higiene Pessoal");
    System.out.println("Insira, na seguinte ordem:");
    System.out.println("(1)- Nome do Produto (ex: Sabonete, EscovaDeDente, SacoDePapelHigienico...");
    System.out.println("(2)- Marca do Produto");
    System.out.println("(3)- Preço");
    System.out.println("(4)- Conteudo");
    System.out.println("(5)- Unidade (ml, g, kg, unidade(s) )");

    nomeAux = scan.next();
    marcaAux = scan.next();
    precoAux = scan.nextDouble();
    contAux = scan.nextDouble();
    uniAux = scan.next();

    Produto p = new Limpeza(nomeAux, marcaAux, precoAux, contAux, uniAux);

    setProdutos.add(p);

    System.out.print("Deseja inserir quantas unidades desse produto no estoque ? ");

    numAux = scan.nextInt();

    p.inserirNoEstoque(numAux);
    System.out.println();
    p.imprimeInfo();

    System.out.println("Novo produto registrado com sucesso!\n");
  }

}