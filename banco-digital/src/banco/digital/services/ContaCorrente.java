package banco.digital.services;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtratoCC() {
		System.out.println("Conta Corrente");
		super.imprimirExtrato();
	}
	
	
}
