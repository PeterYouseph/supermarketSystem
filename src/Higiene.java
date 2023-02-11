class Higiene extends Produto {

    Higiene(String nome, String marca, double preco, double conteudo, String unidade){
      super(nome, marca, preco, conteudo, unidade);
    }
  
    public double descontoClienteVip(){// Calcula o preco para o Cliente Vip
      return (0.75 * getPreco()); // Clientes Vip possuem desconto de 30% nos Produtos de Higiene Pessoal
      
    }
  
    public void imprimeInfo(){
  
      if(getConteudo() > 1)
        System.out.println(getNome() + ' ' + getMarca() + " contendo " + getConteudo() + ' ' + getUnid() + " (R$" + getPreco()+ ')' + ": "+ getQuant() + " unidade(s)");
  
      else
        System.out.println(getNome() + ' ' + getMarca() + " (R$" + getPreco()+ ')' + ": "+ getQuant() + " unidade(s)");
  
    }
  
    
  
  }