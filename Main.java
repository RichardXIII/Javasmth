import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ler o nome preço codigo e disponivel
        Scanner item = new Scanner(System.in);

        System.out.println("Produto ");
        String nome = item.nextLine();

        System.out.println("Codigo");
        int codigo = item.nextInt();

        System.out.println("Prço");
        float preco = item.nextFloat();

        System.out.println("Disponibilidade");
        Boolean disponivel = item.nextBoolean();

        //Criar um objeto Produto
        Produtos produto = new Produtos();

        //colocar os dados no objeto
        produto.nome = nome;
        produto.codigo = codigo;
        produto.preco = preco;
        produto.disponivel = disponivel;

        //exibir os dados no objeto
        System.out.println(produto.nome);
        System.out.println(produto.codigo);
        System.out.println(produto.preco);
        System.out.println(produto.disponivel);

    }

}