package modelo;

public class Carro {

	private String placa;
	private String modelo;
	private double ValorDiario;
	
	public Carro (String vplaca, String vmodelo, double vValor ) {
		
		this.placa = vplaca;
		this.modelo = vmodelo;
		this.ValorDiario = vValor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValorDiario() {
		return ValorDiario;
	}
	
	
	public void setModelo(double vvalor) {
	
		
	}
	
}
