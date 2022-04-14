//import Aula1304.Produto;
import java.util.Scanner;
public class Programa {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Entre com os dados do produto: ");
        System.out.println("Nome : ");
        String nome = sc.nextLine();

        System.out.println("Preço : ");
        double preco = sc.nextDouble();

        System.out.println("Quantidade : ");
        int quantidade = sc.nextInt();

        Produto p = new Produto(nome, preco, quantidade);
        //System.out.println(p.nome + " , $" + p.preco + " , " +  p.quantidade); 
        System.out.println(p);
        System.out.println();
        System.out.println("Produtos dados: " + p);
        // -----------------------------------------
        System.out.println();
        System.out.println("Insira o numero de produtos a ser adicionado");
        quantidade = sc.nextInt();
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
