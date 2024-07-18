package banco.digital.services;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}
	
	public void imprimirExtratoCP() {
		System.out.println("Conta Poupanca");
		super.imprimirExtrato();
	}
	
}
