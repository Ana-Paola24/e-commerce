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
			System.out.println("                  Sua Loja Favorita                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastro de Cliente                  ");
			System.out.println("            2 - Atualizar Dados da Conta Cliente     ");
			System.out.println("            3 - Cadastras Produto                    ");
			System.out.println("            4 - Buscar por Produto                   ");
			System.out.println("            5 - Listar todos os Produtos             ");
			System.out.println("            6 - Deletar Produto                      ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
		
			if (opcao == 9) {
				System.out.println("\n\nBanco do Brasil com Z - O seu Futuro começa aqui!");
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

			case 7:
				System.out.println("Depósito\n\n");
				
				keyPress();
				break;

			case 8:
				System.out.println("Transferência entre Contas\n\n");
				
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

				Projeto Ecommerce Loja Favorita desenvolvido por:

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
