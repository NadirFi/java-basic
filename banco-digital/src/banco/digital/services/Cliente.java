package banco.digital.services;


public class Cliente {
	private static int ID = 0;
	
	private long id;
	private String cpf;
	private String nome;
	
	
	public Cliente(String nome, String cpf) {
		this.id = ID++;
		this.nome = nome;
		this.cpf = cpf;
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


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cpf=" + cpf + ", nome=" + nome + "]";
	}
	
}
