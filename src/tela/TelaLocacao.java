package tela;

import java.io.IOException;

import modelo.Carro;
import modelo.Cliente;
import modelo.Locacao;

public class TelaLocacao extends TelaCadastro {

	@Override
	public void telaExcluir() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void telaCadastrar() throws IOException {

		System.out.println(" === CADASTRAR LOCAÇÃO === ");

		System.out.println(" Informe ID Locação ");
		String vidLocacao = teclado.readLine();

		System.out.println(" Informe Data Inicio ");
		String dataInicio = teclado.readLine();
		
		System.out.println(" Informe Data Final ");
		String dataFim = teclado.readLine();

		System.out.println(" Informe a Placa do Carro ");
		String placa = teclado.readLine();
		
		
		TelaCarro tcar = new TelaCarro();
		Carro car = (Carro) tcar.retornaSelecionado(placa);
		
		System.out.println(" Informe o CPF ");
		String cpf = teclado.readLine();
		
		TelaCliente tcli = new TelaCliente();
		Cliente cli = (Cliente) tcli.retornaSelecionado(cpf);
		
		
		Locacao locacao = new Locacao (vidLocacao, dataInicio, dataFim, car, cli);

		lista.add(locacao);

		
		
		
	}

	@Override
	public void telaAlterar() throws IOException {
		
		System.out.println(" === FINALIZAR LOCAÇÃO === ");

		System.out.println(" Informe o ID da Locação ");
		String vlocacao = teclado.readLine();

		int indice = mostrar (vlocacao);
		

			if (indice != -1) {
				
				Locacao encontrado = (Locacao) lista.get(indice);


				System.out.println(" Digite 0 para manter o valor ou digite 1 para finalizar a locação ");

				String opcao = teclado.readLine();

				if (!opcao.equals("0")) {

					encontrado.finalizarLocacao();
				}



				lista.add(indice, encontrado);

			}
	}

}
