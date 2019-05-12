package tela;


import java.io.IOException;



import modelo.Cliente;


public class TelaCliente extends TelaCadastro {
	


	/*
    public static void main (String[] args) throws NumberFormatException, IOException {
		
		TelaCliente tc = new TelaCliente();
		tc.show ();
	
    }
    */
    
    public void show() throws NumberFormatException, IOException {

	int opcao = 0;
	
	while (opcao != 5) {
		
	System.out.println(" === MENU CLIENTE ===");
	System.out.println(" Escolha umas das opções:");
	System.out.println(" 1- Cadastrar Cliente");
	System.out.println(" 2- Alterar Cliente");
	System.out.println(" 3- Excluir Cliente");
	System.out.println(" 4- Mostrar Todos os Clientes Cadastrados");
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
		System.out.println("Opção Invalida! ");
		break;
	}
}
	
}



        public int mostrar (String valor) {
	  
	  int indice = -1;
	  
	  for (int i = 0; i<lista.size(); i++) {
			
			Cliente c1 =  (Cliente) lista.get(i);
			
			if ((valor.equals("0")) || c1.getCpf().equals(valor));
			
			System.out.println(" ===  INFORMAÇÕES ATUAIS === ");			
			System.out.println(" CPF " + c1.getCpf());
			System.out.println(" Nome " + c1.getNome());
			System.out.println(" ===  === === ");
	  
			if (c1.getCpf().equals(valor)) {
				
				indice = i;
			}
	  
	  }
	return indice;
}
     public void telaMostrar() {
	
	System.out.println(" ===  MOSTRAR TODOS OS CLIENTES === ");		
	System.out.println();


	mostrar ("0");
	
}

    public void telaExcluir() throws IOException {
	
	System.out.println(" === EXCLUIR INFORMAÇÕES DO CLIENTE === ");
	System.out.println(" Informe o CPF: ");
	String vcpf = teclado.readLine();
	
	int indice =  mostrar (vcpf);
	
            if (indice != -1) {
			
			
			System.out.println(" Digite 0 para manter o valor ou 1 para Excluir: ");

			String opcao = teclado.readLine();
			
			if (!opcao.equals("0")) {
				
			lista.remove(indice);
			
			
				
	    }
     }
}
 
  
public void telaAlterar() throws IOException {

	System.out.println(" === ALTERAR INFORMAÇOES DO CLIENTE === ");

	System.out.println(" Informe o CPF: ");
	String vcpf = teclado.readLine();

	int indice = mostrar (vcpf);
	

		if (indice != -1) {
			
			Cliente encontrado = ( Cliente) lista.get(indice);


			System.out.println(" Digite 0 para manter o valor ou digite 1 para novo Nome: ");

			String vnome = teclado.readLine();

			if (!vnome.equals("0")) {

				encontrado.setNome(vnome);
			}



			lista.set(indice, encontrado);

		}

	}

	



	public void telaCadastrar() throws IOException {
	
	System.out.println(" === CADASTRAR CLIENTE ===");
	System.out.println();


	System.out.println(" Informe a CPF");
	String vcpf = teclado.readLine();

	System.out.println(" Informe o Nome");
	String vnome = teclado.readLine();

	
	Cliente carro = new Cliente (vcpf, vnome);

	lista.add(carro);


	System.out.println();

}

}
