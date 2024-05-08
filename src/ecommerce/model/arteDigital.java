package ecommerce.model;

public class arteDigital extends Arte {
	
	private String tamanho;
	private String tempo;

	
	
	

    public arteDigital(int numero, String nome, String artista, String dataCriacao, int tipo, float preco,
			String tamanho, String tempo) {
		super(numero, nome, artista, dataCriacao, tipo, preco);
		this.tamanho = tamanho;
		this.tempo = tempo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Disponível até: " + this.tempo);
	}

	@Override
	public boolean venda(int venda) {
		return true;
		}

}
