//import caixa.Produto;
import java.util.Scanner;
public class Programa {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();
        System.out.println("Entre com os dados do produto: ");
        System.out.println("Nome : ");
        p.nome = sc.nextLine();

        System.out.println("Preço : ");
        p.preco = sc.nextDouble();

        System.out.println("Quantidade : ");
        p.quantidade = sc.nextInt();

        //System.out.println(p.nome + " , $" + p.preco + " , " +  p.quantidade); 
        System.out.println(p);
        System.out.println();
        System.out.println("Produtos dados: " + p);
        // -----------------------------------------
        System.out.println();
        System.out.println("Insira o numero de produtos a ser adicionado");
        int quantidade = sc.nextInt();
        p.addProduto(quantidade);

        System.out.println();
        System.out.println("Novos daos" + p);
      //--------------------------------  
        System.out.println();
        System.out.println("Insira o numero de produtos a ser removido");
        quantidade = sc.nextInt();
        p.removerProdutos(quantidade);

        System.out.println();
        System.out.println("Novos dados" + p);


        sc.close();


    }
}
