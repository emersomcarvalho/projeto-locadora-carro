package tela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TelaPrincipal {
	
	
	public static void main ( String[] args) throws NumberFormatException, IOException   {
		

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(is);
		
		 
		
		int opcao = 0;
		
		while (opcao != 4) {
			
		System.out.println(" === OPÇÕES DE MENU  ===");
		System.out.println(" Escolha umas das opções:");
		System.out.println(" 1- Cliente ");
		System.out.println(" 2- Carro ");
		System.out.println(" 3- Locação ");
		System.out.println(" 4- Sair ");

		 opcao = new Integer(teclado.readLine()).intValue();

		 tela.TelaCarro tc1;
		 TelaCadastro tc;
		 
		switch (opcao) {

		case 1:
			TelaCliente();
			
			tc = new TelaCliente();
			tc.show();
			break;
			
		case 2:
			TelaCarro();
			tc1 = new TelaCarro();
			tc1.show();
			break;
			
		case 3:
			TelaLocacao();
			tc = new TelaLocacao();
			tc.show();
			break;
			
		case 4:
			System.out.println("Até Logo! Sistema Finalizado! ");
			break;

		default:
			System.out.println(" Opção Invalida! ");
			break;
			
			
		}
	  }
	}

	private static void TelaLocacao() {
		// TODO Auto-generated method stub
		
	}

	private static void TelaCarro() {
		// TODO Auto-generated method stub
		
	}

	private static void TelaCliente() {
		// TODO Auto-generated method stub
		
	}

		
}
	
	


