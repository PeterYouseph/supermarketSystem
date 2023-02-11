import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

    public static void main(String[] args) {
        System.out.println("Deseja iniciar o sistema?");
        System.out.println("Digite: ");
        System.out.println("'S' ou 's' - Sim, desejo.\n'N' ou 'n' - Não desejo.");
        Scanner sc = new Scanner(System.in);

        Mercado merc = new Mercado("Facom Atacadista");

        char primeiraEntrada = sc.next().charAt(0);
          
        while(primeiraEntrada != 's' && primeiraEntrada != 'S' && primeiraEntrada != 'n' && primeiraEntrada != 'N'){
            try{
            System.out.println("Carácter inserido é inválido!");
            System.out.print("|------------------------------------------|\n");
            System.out.println("Deseja iniciar o sistema?");
            System.out.println("Digite: ");
            System.out.println("'S' ou 's' - Sim, desejo.\n'N' ou 'n' - Não desejo.");
            primeiraEntrada = sc.next().charAt(0);
            }
        catch (InputMismatchException exception) {
            System.out.println("Carácter inserido é inválido!");
            System.out.print("|------------------------------------------|\n");
            System.out.println("Deseja iniciar o sistema?");
            System.out.println("Digite: ");
            System.out.println("'S' ou 's' - Sim, desejo.\n'N' ou 'n' - Não desejo.");
            primeiraEntrada = sc.next().charAt(0);
            continue;
            }
        }

        while(primeiraEntrada == 's' || primeiraEntrada == 'S' || primeiraEntrada == 'n' || primeiraEntrada == 'N'){ 

            if (primeiraEntrada == 'n' || primeiraEntrada == 'N'){
                break;
            }
            else{

                int opcao;
                
                System.out.print("##--Qual ação você deseja realizar?--##\n");
                System.out.print("|------------------------------------------|\n");
    
                System.out.print("##--------<Menu funcionários>--------##\n");
                System.out.print("| Opção '1' - Inserir funcionário          |\n");
                System.out.print("| Opção '2' - Consultar funcionário        |\n");
                System.out.print("| Opção '3' - Mudar salário de funcionário |\n");
                System.out.print("|------------------------------------------|\n");
    
                System.out.print("##--------<Menu setores>-------------##\n");
                System.out.print("| Opção '4' - Consultar estoque            |\n");
                System.out.print("| Opção '5' - Inserir novo produto         |\n");   
                System.out.print("|------------------------------------------|\n");
    
                System.out.print("##--------<Menu Clientes VIP>--------##\n");
                System.out.print("| Opção '6' - Inserir cliente VIP          |\n");
                System.out.print("| Opção '7' - Consultar clientes VIP       |\n");
                System.out.print("|------------------------------------------|\n");
    
                System.out.println("Opção '8' - Cancelar");
    
                System.out.print("Digite uma opção: ");
                opcao = sc.nextInt();
                
                switch(opcao){
                    case 1:
                        System.out.print("Você escolheu -> Inserir funcionário: ");
                        break;
                    
                    case 2:
                        System.out.print("Você escolheu -> Consultar funcionário: ");
                        break;
                    
                    case 3:
                        System.out.println("Você escolheu -> Mudar salário de funcionário: ");
                        break;
                    
                    case 4:
                        System.out.println("Você escolheu -> Consultar estoque: ");
                        merc.setores[0].imprimeEstoque();
                        System.out.println();
                        merc.setores[1].imprimeEstoque();
                        System.out.println();
                        merc.setores[2].imprimeEstoque();
                        System.out.println();
                        merc.setores[3].imprimeEstoque();
                        System.out.println();
                        merc.setores[4].imprimeEstoque();
                        
                        
                        break;
                    
                    case 5:
                        int numAux;

                        System.out.println("Você escolheu -> Inserir novo produto: ");
                        System.out.println("Escolha em qual setor registrar seu novo produto: ");
                        System.out.println("(1)- Bebidas");
                        System.out.println("(2)- Hortifruti");
                        System.out.println("(3)- Açougue");
                        System.out.println("(4)- Limpeza");
                        System.out.println("(5)- Higiene Pessoal");


                        numAux = sc.nextInt();
                        
                        merc.setores[numAux-1].novoProduto();
                        
                        break;
                    
                    case 6:
                        System.out.println("Você escolheu -> Inserir cliente VIP: ");
                        break;
                    
                    case 7:
                        System.out.println("Você escolheu -> Consultar clientes VIP: ");
                        break;
                    
                    case 8:
                        System.out.println("Você escolheu -> Cancelar: ");
                        break;
                    
                    default: 
                        System.out.println("A opção que você inseriu não é válida.");
                        break;
                }
                
                System.out.println("Você deseja realizar mais alguma ação?\n");
                System.out.println("Digite: ");
                System.out.println("'S' ou 's' - Sim, desejo.\n'N' ou 'n' - Não desejo.");
                primeiraEntrada = sc.next().charAt(0);  
            }    
        }
        System.out.println("Obrigado por utilizar nosso sistema!");

    }
       
}



/*  Teste:


Refrigerante CocaCola Uva 9.99 600 mL
90
Cerveja ContiBeer Subzero 2.99 300 mL
38
Refrigerante Fanta Laranja 5.99 400 mL
58


BananaNanica 1.99 1 2
28
SacoPitaya 9.99 2 1
19
MacaVerda 4.99 1 1
29

Picanha Bovina 51.99 1
10
Bisteca Suina 16.99 1
20


Detergente Ype 5.99 500 mL
30
SabaoEmBarra Clear 3.99 2 Kg
29

PastaDeDente Colgate 7.99 300 g
77
Sabonete Phebo 4.99 1 unidade
20


*/

