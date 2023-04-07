package principal;

import contas.Conta;
import contas.ContaCorrente;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Sistema Bancário");
		
		ContaCorrente conta = new ContaCorrente();
		conta.setSaldo(1000);
		conta.setTitular("Marcelo");
		
		conta.imprimeExtrato();

	}

}
