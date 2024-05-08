package ecommerce.model;

public class arteFisica extends Arte{

	private int quantidade;
	
	
	public arteFisica(int numero, String nome, String artista, String dataCriacao, int tipo, float preco,
			int quantidade) {
		super(numero, nome, artista, dataCriacao, tipo, preco);
		this.quantidade = quantidade;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	@Override
	public boolean venda (int venda) {
		if (this.getQuantidade() < venda) {
			System.out.println("\nNão há unidades suficientes!");
			return true;
		}
		
		this.setQuantidade(this.getQuantidade() - venda);
		return false;
	}


	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade: " + this.quantidade);
	}
		
	}


