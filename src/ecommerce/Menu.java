package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import ecommerce.controller.EcommerceController;
import ecommerce.model.arteDigital;
import ecommerce.model.arteFisica;

public class Menu {

	public static void main(String[] args) {
		
		EcommerceController artes = new EcommerceController();
		Scanner leia = new Scanner (System.in);
		
		int opcao, numero, tipo, quantidade;
		String nome, artista, dataCriacao, tamanho, tempo; 
		float preco;
		
		System.out.println("\nArtes novas:\n");
		
		arteFisica af1 = new arteFisica (artes.gerarNumero(), "Boa Noite", "Jacqueline", "08052024", 1, 1200.0f, 12, "A2");
		artes.cadastrar(af1);
		arteFisica af2 = new arteFisica (artes.gerarNumero(), "Belo Dia", "Thiago", "07052024", 1, 1200.0f, 10, "A3");
		artes.cadastrar(af2);
		arteDigital ad1 = new arteDigital (artes.gerarNumero(), "Mundo Tech", "Gaby", "02022024", 2, 300.0f,"10052024" );
		artes.cadastrar(ad1);
		arteDigital ad2 = new arteDigital (artes.gerarNumero(), "Generation", "Alumini", "10042024", 2, 7000.0f, "28062024" );
		artes.cadastrar(ad2);
		arteDigital ad3 = new arteDigital (artes.gerarNumero(), "Batalhas", "Jafar", "10042024", 2, 230.0f, "30062024" );
		artes.cadastrar(ad3);
		
		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                  Sua Arte Favorita                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastras Arte                       ");
			System.out.println("            2 - Buscar Arte por ID                   ");
			System.out.println("            3 - Atualizar Dados da Arte              ");
			System.out.println("            4 - Listar todos as Obras                ");
			System.out.println("            5 - Excluir Arte do Catálogo             ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite uma opção válida!");
				leia.nextLine();
				opcao = 0;
			}
		
			if (opcao == 6) {
				System.out.println("\n\nSua Arte Favorita - Onde a imaginação nasce e se realiza!*");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {

			case 1:
				System.out.println("Cadastrar Arte\n");
				System.out.println("Digite o Nome da Arte: ");
				nome = leia.nextLine();
				leia.nextLine();
				System.out.println("Digite o Nome do Artista: ");
				artista = leia.nextLine();
				
				System.out.println("Digite a data de criação: ");
				dataCriacao = leia.nextLine();
				
				System.out.println("Digite o preço (R$): ");
	            preco = leia.nextFloat();
				
				do {
					System.out.println("Digite o Tipo de Arte (1-Arte Física ou 2-Arte Digital): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);
				
				switch (tipo) {
				case 1 -> {
					System.out.println("Digite a quantidade disponível: ");
					quantidade = leia.nextInt();
					leia.nextLine();
					System.out.println("Digite o dia o Tamanho da Arte (ex: A4): ");
					tamanho = leia.nextLine();
					artes.cadastrar(new arteFisica(artes.gerarNumero(), nome, artista, dataCriacao, tipo, preco, quantidade,tamanho));
				}
				case 2 -> {
					leia.nextLine();
					System.out.println("Digite o dia o até qual data a Arte estará disponível: ");
					tempo = leia.nextLine();
					
					artes.cadastrar(new arteDigital(artes.gerarNumero(), nome, artista, dataCriacao, tipo, preco, tempo));
				} 
				}
				
				
				keyPress();
				break;

			case 2:
				System.out.println( "Buscar Arte por ID\n\n");
				System.out.println("Digite o número de ID da Arte: ");
				numero = leia.nextInt();
				
				artes.procurarPorNumero(numero);
				keyPress();
				break;

			case 3:
				System.out.println( "Atualizar dados da Arte\n\n");
				System.out.println("Digite o número de ID da Arte: ");
				numero = leia.nextInt();
				var buscaArte = artes.buscarNaCollection(numero);
				
				if (buscaArte != null) {
					
					System.out.println("Digite o Nome da Arte: ");
					nome = leia.nextLine();
					System.out.println("Digite o Nome do Artista: ");
					leia.skip("\\R?");
					artista= leia.nextLine();
					System.out.println("Digite a data de criação (somente números, sem traços): ");
					dataCriacao = leia.nextLine();
					System.out.println("Digite o Saldo da Conta (R$): ");
					preco = leia.nextFloat();
					
					tipo = buscaArte.getTipo();
					
					switch (tipo) {
					case 1 -> {
						System.out.println("Digite a quantidade disponível: ");
						quantidade = leia.nextInt();
						System.out.println("Digite o dia o Tamanho da Arte: ");
						tamanho = leia.nextLine();
						artes.atualizar(new arteFisica(artes.gerarNumero(), nome, artista, dataCriacao, tipo, preco, quantidade, tamanho));
					}
					case 2 -> {
						System.out.println("Digite o dia o Tamanho da Arte: ");
						tamanho = leia.nextLine();
						leia.nextLine();
						System.out.println("Digite o dia o até qual data a Arte estará disponível: ");
						tempo = leia.nextLine();
						artes.atualizar(new arteDigital(artes.gerarNumero(), nome, artista, dataCriacao, tipo, preco, tempo));
					}
					
					}
				} else {
					System.out.println("A Arte não foi encontrada!");
				}
				
				keyPress();
				break;

			case 4:
				System.out.println("Listar todas as Contas\n\n");
				artes.listarTodas();
				keyPress();
				break;

			case 5:
				System.out.println("Excluir Arte do Catálogo\n\n");
				System.out.println("Digite o ID da Arte: ");
				numero = leia.nextInt();
				artes.deletar(numero);
				keyPress();
				break;

			default:
				System.out.println("\nOpção Inválida\n");
				keyPress();
				break;

			}
		}
		
		
	}
	
	public static void sobre() {
		System.out.println("""
				\n*********************************************

				Projeto Ecommerce Sua Arte Favorita desenvolvido por:

				Ana Paola - Generation - Java 74
				github.com/conteudoGeneration

				**********************************************
				""");
	}
	
	public static void keyPress() {
		try {
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
