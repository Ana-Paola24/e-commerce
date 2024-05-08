package ecommerce.repository;

import ecommerce.model.Arte;

public interface EcommerceRepository {

	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(Arte arte);
	public void atualizar(Arte arte);
	public void deletar(int numero);
	
	public void venda(int numero, int quantidade);
}
