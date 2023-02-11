class Limpeza extends Produto {
 
  Limpeza(String nome, String marca, double preco, double conteudo, String unidade){
    super(nome, marca, preco, conteudo, unidade);
  }

  public double descontoClienteVip(){ // Calcula o preco para o Cliente Vip
    return(0.90 * getPreco()); // Clientes Vip possuem 10% de desconto em produtos de Limpeza
  }

  public void imprimeInfo(){
    System.out.println(getNome() + ' '+ getMarca() +' ' + getConteudo() + ' ' + getUnid() + " (R$" + getPreco()+ ')' + ": "+ getQuant() + " unidade(s)");
  }

} 