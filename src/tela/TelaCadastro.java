package tela;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

	public abstract class TelaCadastro {
		
	
		protected static Vector lista = new Vector();
	
		protected BufferedReader teclado;
	
		public TelaCadastro() {
			
			InputStreamReader is = new InputStreamReader(System.in);
			teclado = new BufferedReader(is);
	}
		
		public Object retornaSelecionado(String valor) {
			
			int indice = mostrar(valor);
			
			return lista.get(indice);
			
		}
		
				
	public void show() throws NumberFormatException, IOException {

	int opcao = 0;
	
	while (opcao != 5) {
	System.out.println(" === OPÇÕES DE MENU  ===");
	System.out.println(" Escolha umas das opções:");
	System.out.println(" 1- Cadastrar");
	System.out.println(" 2- Alterar ");
	System.out.println(" 3- Excluir ");
	System.out.println(" 4- Mostrar Todos Valores Cadastrados");
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



		public int mostrar (String valor) {
			  
			  int indice = -1;
			  
			  for (int i = 0; i<lista.size(); i++) {
					
					Object c1 =  lista.get(i);
					
					if ((valor.equals("0")) || c1.equals(valor));
					
					System.out.println(" ===  INFORMAÇÕES ATUAIS === ");			
					System.out.println(c1.toString());
					System.out.println();
			  
					if (c1.equals(valor)) {
						
						indice = i;
					}			  
			  }
			  
			return indice;
		}
		
		public void telaMostrar() {
		mostrar ("0");
		
		}
		
		public abstract  void telaExcluir() throws IOException ;
			
		
		public abstract  void telaCadastrar()throws IOException;

	

		public abstract void  telaAlterar()throws IOException;
				
				
		}		
			

				
		
		