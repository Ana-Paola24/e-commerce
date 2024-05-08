package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int opcao;
		
		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                  Sua Arte Favorita                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastras Produto                    ");
			System.out.println("            2 - Buscar Arte por ID                   ");
			System.out.println("            3 - Atualizar Produto                    ");
			System.out.println("            4 - Listar todos as Obras                ");
			System.out.println("            5 - Excluir do Catálogo                  ");
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
				System.out.println( "Criar Conta\n\n");
				
				
				keyPress();
				break;

			case 2:
				System.out.println( "Listar todas as Contas\n\n");
				
				keyPress();
				break;

			case 4:
				System.out.println( "Atualizar dados da Conta\n\n");
				
				keyPress();
				break;

			case 5:
				System.out.println("Apagar a Conta\n\n");
				
				keyPress();
				break;

			case 6:
				System.out.println("Saque\n\n");
				
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
