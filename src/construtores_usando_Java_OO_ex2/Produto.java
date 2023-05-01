package construtores_usando_Java_OO_ex2;

public class Produto {
	public String name;
	public double price; // atributos
	public int quantity;

	public Produto(String name, double price, int quantity) {
		this.name = name;
		this.price = price; //Construtor
		this.quantity = quantity;
	}

	public double totalEstoque() {

		return price * quantity;
	}

	public void addProdutos(int quantity) { // entre () é o parâmetro do método
		this.quantity += quantity;
		// recebe atributos quantity que já tinha nele + parâmetro quantiity
	}

	public void removerProduto(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() { // toString -> colocando o objeto produto na forma de String
		return name + ", $ " + String.format("%.2f", price) + // String.format() para adicionar um valor formatado.
																// colocando a formatação, nome.
				", " + quantity + " unidades, Total: $ " + String.format("%.2f", totalEstoque());
	}

}
