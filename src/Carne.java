class Carne extends Produto {

    Carne(String nome, String marca, double preco, double conteudo, String unidade){
      super(nome, marca, preco, conteudo, unidade);
    }
  
    public double descontoClienteVip(){ // Calcula o preco para o Cliente Vip
      return(0.95 * getPreco()); // Clientes Vip possuem 5% de desconto em produtos do Açougue
    }
  
    public void imprimeInfo(){
      System.out.println(getNome() + ' ' + getMarca() + ' ' + getConteudo() + ' ' + getUnid() + " (R$" + getPreco()+ ')' + ": "+ getQuant() + " unidade(s)");
    }
  
  }