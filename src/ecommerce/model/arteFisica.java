package ecommerce.model;

public class arteFisica extends Arte{

	private int quantidade;
	
	public arteFisica(String nome, String artista, String dataCriacao, int tipo, float preco, int quantidade) {
		super(nome, artista, dataCriacao, tipo, preco);
		this.quantidade = quantidade;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public void venda (int venda) {
		if (this.getQuantidade() < venda) {
			System.out.println("\nNão há unidades suficientes!");
			
		}
		
		this.setQuantidade(this.getQuantidade() - venda);
		
	}


	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade: " + this.quantidade);
	}
		
	}


