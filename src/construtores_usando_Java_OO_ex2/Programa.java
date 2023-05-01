package construtores_usando_Java_OO_ex2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira os dados do Produto: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		int quantity = sc.nextInt();

		Produto produto = new Produto(name, price, quantity);
		// Assim não permitindo/obrigando que o programa inicie antes de digitar os dados do produto.
        // Tendo que digita-los no momento de instanciar o objeto.
		System.out.println("informação do produto: " + produto);
		System.out.println();

		System.out.print("Número de produtos para adicionar ao estoque: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade); // para atualizar a quantidade no objeto produto
		System.out.println("Dados atualizados: " + produto);
		System.out.println();

		System.out.print("Digite número de produtos para serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		System.out.println("Dados atualizados: " + produto);

		sc.close();
	}

}
