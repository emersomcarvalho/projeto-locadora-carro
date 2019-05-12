package modelo;

import java.util.Calendar;

public class Locacao {
	
	String idLocacao;
	Carro carro;
	Cliente cliente;
	String dataInicio;
	String dataFim;
	final String SEPARADOR_DATA = "/";
	private String calcular;
	
	
	public Locacao (String vid, String vdataInicio, String vdataFim, Carro vcarro, Cliente vcliente) {
		
		
		this.idLocacao = vid;
		this.dataInicio = vdataInicio;
		this.dataFim = vdataFim;
		this.carro = vcarro;
		this.cliente = vcliente;
		
	}
	
	public String getIdLocacao() {
		return idLocacao;
	}
	
	
	public void setIdLocacao(String idLocacao) {
		this.idLocacao = idLocacao;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
    public String toString () {
		
		return " ID da Locação: " + this.getIdLocacao() + "\n" + " Data de Inicio " + this.getDataInicio() + 
				" Data de Fim " + this.getDataFim() + "\n" + this.getCarro().toString() + "\n" + this.getCliente().toString();
	}
	
	public boolean equals (Object obj) {
	
	String vidLocacao = (String) obj;
	
	return this.getIdLocacao().equals(vidLocacao);
	
	}
	public void finalizarLocacao() {

		System.out.println("Valor a pagar da Locação; " + this.calcular);
	
		System.out.println("Locação Finalizada " );
		
	}

	public double calcular() {
		// TODO Retornar (Data fim - DataInicio) * carro.getValorDia
		
		
		String [] sdInicio = this.dataInicio.split(SEPARADOR_DATA);
		String [] sdFim = this.dataFim.split(SEPARADOR_DATA);
		
		
		Calendar dtInicio = Calendar.getInstance();
		Calendar dtFim = Calendar.getInstance();
		
		dtInicio.set(Calendar.DAY_OF_MONTH, new Integer (sdInicio[0]).intValue());
		dtInicio.set(Calendar.MONTH,new Integer (sdInicio[1]).intValue());
		dtInicio.set(Calendar.YEAR, new Integer (sdInicio[2]).intValue());
		
		
		dtFim.set(Calendar.DAY_OF_MONTH, new Integer (sdFim[0]).intValue());
		dtFim.set(Calendar.MONTH, new Integer (sdFim[1]).intValue());
		dtFim.set(Calendar.YEAR, new Integer (sdFim[2]).intValue());
		
		
		int resultadoDias = (int)(dtFim.getTimeInMillis() - dtInicio.getTimeInMillis()) / (1000 * 60 * 60 * 24);
		
		
		
		return resultadoDias * this.getCarro().getValorDiario();
	}
	
}
