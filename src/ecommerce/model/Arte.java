package ecommerce.model;



public abstract class Arte {
	
	private int numero;
	private String nome;
	private String artista;
	private String dataCriacao;
	private int tipo;
	private float preco;
	
	

public Arte(int numero, String nome, String artista, String dataCriacao, int tipo, float preco) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.artista = artista;
		this.dataCriacao = dataCriacao;
		this.tipo = tipo;
		this.preco = preco;
	}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getArtista() {
	return artista;
}

public void setArtista(String artista) {
	this.artista = artista;
}

public String getDataCriacao() {
	return dataCriacao;
}

public void setDataCriacao(String dataCriacao) {
	this.dataCriacao = dataCriacao;
}

public int getTipo() {
	return tipo;
}

public void setTipo(int tipo) {
	this.tipo = tipo;
}

public float getPreco() {
	return preco;
}

public void setPreco(float preco) {
	this.preco = preco;
}

public abstract boolean venda(int venda);

public void visualizar() {
	
	String tipo = "";
	
	switch(this.tipo) {
	
	case 1:
		tipo = "Arte Física";
		break;
		
	case 2:
		tipo = "Arte Digital";
		break;
	}

		System.out.println( "\n\n*******************************************");
		System.out.println("Dados da Obra:");
		System.out.println( "*******************************************");
		System.out.println("Nome da Obra: " + this.nome);
		System.out.println("NOme do Artista: " + this.artista);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Data de Criação: " + this.dataCriacao);
		System.out.println("Valor: " + this.preco);
	}


}
