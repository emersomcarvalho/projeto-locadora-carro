package modelo;

public class Cliente {
	
	
	private String cpf;
	private String nome;
	
	public Cliente (String vcpf, String vnome) {
		this.cpf = vcpf;
		this.nome = vnome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString () {
		
		return " CPF: " + this.getCpf() + "\n" + " Nome: " + this.getNome();
	}
	
	public boolean equals (Object obj) {
	
	String vcpf = (String) obj;
	
	return this.getCpf().equals(vcpf);
	
	}
}