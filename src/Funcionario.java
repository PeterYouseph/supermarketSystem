import java.util.Scanner;
class Funcionario extends Pessoa {
  private int salario;

  Funcionario(String nome, int cpf, int salario){ // Construtor
    super(nome, cpf);
    this.salario = salario;
  }

  public int getSalario(){
    return salario;
  }
    
  public void imprimeInfos(){
    System.out.println("Nome do Funcionario: " + getNome() + "\n Salario: " + getSalario());
  }

  public void mudarSalario(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Defina o novo salario de " + getNome() + " (em R$)");
    salario = scan.nextInt();
    scan.close();
  }
  
}