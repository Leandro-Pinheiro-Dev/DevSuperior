package EntitiesEncapsulamento;

	public class ProductEncapsulamento {
		private String name;
		private double price; // preço
		private int quantity; // quantidade


		
		public ProductEncapsulamento() { //CONSTRUTOR padrao
		}
		
//aqui esta os CONSTRUTORES especificado
		public ProductEncapsulamento(String name, double price, int quantity) { 
			this.name = name;
			this.price = price;
			this.quantity = quantity; 
		}
		
// SOBRECARGA mesma operação, outros parametros(sem o quantity)
		public ProductEncapsulamento(String name, double price) { 
			this.name = name;
			this.price = price;
			
		}
		 
//inicia o ENCAPSULAMENTO GETTERS AND SETTERS
			public String getName() { 
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}

//metodos adicionais entradas e saidas
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
			return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
						+ String.format("%.2f", totalvalueInStock());
		}
}


