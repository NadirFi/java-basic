package banco.digital.services;

public abstract class Conta implements IConta{
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected Agencia agencia;
	protected Cliente cliente;
	protected double saldo;
	
	public Conta(Cliente cliente) {
		agencia = new Agencia(AGENCIA_PADRAO, SEQUENCIAL++);
		saldo = 0;
		this.cliente = cliente;
	}


	public Agencia getAgencia() {
		return agencia;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public double getSaldo() {
		return saldo;
	}


	@Override
	public void sacar(double valor) {
		if (valor < this.saldo) {
			this.saldo -= valor;
		}else {
			System.out.println("Saldo insuficiente !!");
			System.out.println("Tentativa de saque: " + valor);
			System.out.println("Saldo: " + this.saldo);
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		if (valor < this.saldo) {
			this.sacar(valor);
			contaDestino.depositar(valor);			
		}else {
			System.out.println("Saldo insuficiente !!");
			System.out.println("Tentativa de transferencia: " + valor);
			System.out.println("Saldo: " + this.saldo);
		}
	}
	
	protected void imprimirExtrato() {
		System.out.println("Agencia: " + this.agencia.getId());
		System.out.println("Numero Conta Corrente: " + this.agencia.getNumero());
		System.out.println("Nome: " + this.cliente.getNome());
		System.out.println("CPF: " + this.cliente.getCpf());
		System.out.println("Saldo: " + this.saldo);
	}
}
