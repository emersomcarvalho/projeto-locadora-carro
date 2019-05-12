package tela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import modelo.Carro;

public class TelaCarro {

	BufferedReader teclado;

	List<Carro> listaCarro = new ArrayList<Carro>();

	public TelaCarro() {

		InputStreamReader is = new InputStreamReader(System.in);
		teclado = new BufferedReader(is);

	}
	
		
		

	public void show() throws NumberFormatException, IOException {

		int opcao = 0;
		
		while (opcao != 5) {
		System.out.println(" === MENU CARRO ===");
		System.out.println(" Escolha umas das opções:");
		System.out.println(" 1- Cadastrar Carro");
		System.out.println(" 2- Alterar Carro");
		System.out.println(" 3- Ecluir Carro");
		System.out.println(" 4- Mostrar Todos os Carros Cadastrados");
		System.out.println(" 5- Voltar");

		 opcao = new Integer(teclado.readLine()).intValue();

		
		switch (opcao) {

		case 1:
			telaCadastrar();
			break;
		case 2:
			telaAlterar();
			break;
		case 3:
			telaExcluir();
			break;
		case 4:
			telaMostrar();
			break;
		case 5:
			System.out.println(" Retornando ao Menu Principal");

			break;

		default:
			System.out.println(" Opção Invalida! ");
			break;
		}
	}
}
/**
 * 
 * @param /SE O VALOR FOR 0, APRESENTA TODOS OS VALORES, SE FOR DIFERENTE, APRESENTA APENAS O VALOR SE ENCONTRADO.
 * 
 * @return -1  /SE N�O FOR ENCONTRADO E PARA QUANDO BUSCO TODOS OS VALORES OU RETORNA O INDICE SE FOR ENCONTRADO
 *  * 
 */
	
  private int mostrar (String valor) {
	  
	  int indice = -1;
	  
	  for (int i = 0; i<listaCarro.size(); i++) {
			
			Carro c1 = listaCarro.get(i);
			
			if ((valor.equals("0")) || c1.getPlaca().equals(valor));
			
			System.out.println(" ===  INFORMAÇÕES ATUAIS === ");			
			System.out.println(" Placa; " + c1.getPlaca());
			System.out.println(" Modelo; " + c1.getModelo());
			System.out.println(" Valor Diário; " + c1.getValorDiario());
			System.out.println(" ===  === === ");
	  
			if (c1.getPlaca().equals(valor)) {
				
				indice = i;
			}
	  
	  }
	return indice;
  }
	
	private void telaMostrar() {

		System.out.println(" === MOSTRAR INFORMAÇÕES DOS CARROS === ");
      
		 mostrar ("0");
		 
		}
			
		
	
	
	private void telaExcluir() throws IOException {
		
		System.out.println(" === EXCLUIR INFORMAÇÕES DO CARRO === ");
		System.out.println(" Informe a Placa");
		String vplaca = teclado.readLine();
		
		int indice =  mostrar (vplaca);
		
	            if (indice != -1) {
				
				
				System.out.println(" Digite 0 para manter o valor ou 1 para Excluir: ");

				String opcao = teclado.readLine();
				
				if (!opcao.equals("0")) {
					
				listaCarro.remove(indice);
				
				
					
				 }
	           }		
	        } 
	    

	private void telaAlterar() throws IOException {

		System.out.println(" === ALTERAR INFORMA��ES DO CARRO === ");

		System.out.println(" Informe a Placa");
		String vplaca = teclado.readLine();

		int indice = mostrar (vplaca);
		

			if (indice != -1) {
				
				Carro encontrado = listaCarro.get(indice);


				System.out.println(" Digite 0 para manter o valor ou digite 1 para novo Modelo: ");

				String vmodelo = teclado.readLine();

				if (!vmodelo.equals("0")) {

					encontrado.setModelo(vmodelo);
				}

				System.out.println(" Digite 0 para manter o valor ou digite 1 novo Valor Di�rio: ");
				double vvalor = new Double(teclado.readLine()).doubleValue();

				if (vvalor != 0) {

					encontrado.setModelo(vvalor);

				}

				listaCarro.set(indice, encontrado);

			}

		}

	

	private void telaCadastrar() throws IOException {

		System.out.println(" === CADASTRAR CARRO ===");

		System.out.println(" Informe a Placa");
		String vplaca = teclado.readLine();

		System.out.println(" Informe o Modelo");
		String vmodelo = teclado.readLine();

		System.out.println(" Informe o Valor Diário");
		double vvalor = new Double(teclado.readLine()).doubleValue();

		Carro carro = new Carro(vplaca, vmodelo, vvalor);

		listaCarro.add(carro);

		System.out.println(" ===    ==   === ");

	}

	public Carro retornaSelecionado(String placa) {
		// TODO Auto-generated method stub
		return null;
	}
}