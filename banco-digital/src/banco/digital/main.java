package banco.digital;

import banco.digital.services.Cliente;
import banco.digital.services.ContaCorrente;
import banco.digital.services.ContaPoupanca;

public class main {

	public static void main(String[] args) throws Exception {
		Cliente cliente00 = new Cliente("Nadir Filho", "11029101623");
		Cliente cliente01 = new Cliente("Julia Soares", "11029101624");
		Cliente cliente02 = new Cliente("Gustavo Soares", "11029101625");
		Cliente cliente03 = new Cliente("Sueli Damasio", "11029101626");
		ContaCorrente cc00 = new ContaCorrente(cliente00);
		ContaCorrente cc01 = new ContaCorrente(cliente03);
		ContaPoupanca contaPoupanca00 = new ContaPoupanca(cliente01);
		ContaPoupanca contaPoupanca01 = new ContaPoupanca(cliente02);
		
		cc00.depositar(500);
		cc01.depositar(2500);
		cc00.transferir(600, contaPoupanca01);
		cc01.transferir(1000, contaPoupanca00);
		cc01.transferir(300, contaPoupanca01);
		
		System.out.println("-----------------------------------------------------");
		cc00.imprimirExtratoCC();
		System.out.println("-----------------------------------------------------");
		cc01.imprimirExtratoCC();
		System.out.println("-----------------------------------------------------");
		contaPoupanca00.imprimirExtratoCP();
		System.out.println("-----------------------------------------------------");
		contaPoupanca01.imprimirExtratoCP();
		System.out.println("-----------------------------------------------------");
	}

}
