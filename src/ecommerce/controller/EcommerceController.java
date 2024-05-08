package ecommerce.controller;

import java.util.ArrayList;
import ecommerce.model.Arte;
import ecommerce.repository.EcommerceRepository;


public class EcommerceController implements EcommerceRepository {
	
	private ArrayList<Arte> listaArte = new ArrayList<Arte>();
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		var arte = buscarNaCollection(numero);
		if (arte != null)
			arte.visualizar();
		else
			System.out.println("\nA Arte de número: " + numero + " não foi encontrada!");
		
	}
	@Override
	public void listarTodas() {
		for (var artes : listaArte) {
        	artes.visualizar();
        }
		
	}
	@Override
	public void cadastrar(Arte arte) {
		listaArte.add(arte);
		System.out.println("\nA Arte de ID: " + arte.getNumero() + " foi criada com sucesso!");
		
	}
	@Override
	public void atualizar(Arte arte) {
      var buscaArte = buscarNaCollection(arte.getNumero());
		
		if (buscaArte != null) {
			listaArte.set(listaArte.indexOf(buscaArte), arte);
			System.out.println("\nA Arte de ID: " + arte.getNumero() + " foi atualizada com sucesso!");
		} else
			System.out.println("\nA Arte de ID: " + arte.getNumero() + " não foi encontrada!");
		
		
	}
	@Override
	public void deletar(int numero) {
       var arte = buscarNaCollection(numero);
		
		if (arte != null) {
			if (listaArte.remove(arte) == true)
				System.out.println("\nA Arte de ID: " + numero + " foi excluida com sucesso!");
		} else
			System.out.println("\nA Arte de ID: " + numero + " não foi encontrada!");
		
		
	}
	
	public int gerarNumero() {
		return ++ numero;
	}
	
	@Override
	public void venda(int numero, int quantidade) {
       var arte = buscarNaCollection(numero);
		
		if(arte != null) {
			if (arte.venda(quantidade) == true)
				System.out.println("\nO Venda da Obra de ID: " + numero + " foi efetuado com sucesso!");
		} else
			System.out.println("\nA Conta número: " + numero + " não foi encontrada!");
		
	}
	
	public Arte  buscarNaCollection(int numero) {
		for (var arte : listaArte) {
			if (arte.getNumero() == numero) {
				return arte;
			}
		}
		return null;
	}


}
