package banco.digital.services;

public class Agencia {
	private long id;
	private int numero;
	
	public Agencia(long id, int numero) {
		this.id = id;
		this.numero = numero;
	}
	
	public long getId() {
		return id;
	}


	public int getNumero() {
		return numero;
	}


	@Override
	public String toString() {
		return "Agencia [id=" + id + ", numero=" + numero + "]";
	}
}
