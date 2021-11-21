import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    Produto[] p = new Produto[5];

    p[0] = new Bebida("Refrigerante", "Coca", 10, 600,"ml");
    p[0].colocarNoEstoque(5);

    p[1] = new Bebida("Refrigerante","Pepsi", 10, 300,"ml");
    p[1].colocarNoEstoque(10);

    p[2] = new Bebida("Cerveja", "Skol Duplo Malte", 10, 500,"ml");
    p[2].colocarNoEstoque(3);

    p[3] = new Bebida("Refrigerante","Guarana", 10, 1000,"ml");
    p[3].colocarNoEstoque(9);

    p[4] = new Bebida("Refrigerante","Tubaina", 10, 2000,"ml");
    p[4].colocarNoEstoque(2);
    
    Setor s = new Setor("Bebidas", 5, p);

    s.imprimeEstoque();

  }
}