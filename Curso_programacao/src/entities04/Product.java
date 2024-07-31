package entities04;

public class Product {
	public String name;
	public double price; // preço
	public int quantity; // quantidade 

		public Product(String name, double price, int quantity) { 
		this.name = name;
		this.price = price;
		this.quantity = quantity; 
		}
		public double totalvalueInStock() { // valor total de estoque
			return price * quantity;
		}

		public void addProduct(int quantity) { // Adicionar produto
			this.quantity += quantity;
		}

		public void removeProduct(int quantity) { // remove produtos
			this.quantity -= quantity;
		}
 
		public String toString() {
			return name 
					+ ", $ "
					+ String.format("%.2f", price) 
					+ ", " + quantity + " units, Total: $ "
					+ String.format("%.2f", totalvalueInStock());
		}
}