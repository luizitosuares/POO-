package principal;

import contas.*;



public class Sistema {

	public static void main(String[] args) {
		
		
		ContaPoupanca poupador = new ContaPoupanca();
		poupador.setTarifa(25);
		poupador.setLimite(15);
		poupador.setAgencia(355555);
		poupador.setNumero(15);
		poupador.setSaldo(1500);
		poupador.setTitular("Nelson");
		poupador.setTipo("CDI");
		poupador.toString();
		
		
	System.out.println(poupador.toString());
		
		
		
		ContaCorrente correntista = new ContaCorrente();
		correntista.setRendimento(10);
		correntista.setAgencia(145555);
		correntista.setNumero(12);
		correntista.setSaldo(2500);
		correntista.setTitular("Maria");
		correntista.setTipo("Nominal");
		correntista.toString();
		
		System.out.println(correntista.toString());
	
	
		ContaPoupancaEspecial personalite = new ContaPoupancaEspecial();
		
		personalite.setCartaoDebito(154545454);
		personalite.setLimite(1500);
		personalite.setTarifa(1);
		personalite.setAgencia(144144);
		personalite.setNumero(147474);
		personalite.setTitular("Francisco");
		personalite.setTipo("Premium");
		personalite.setSaldo(100000000);
		personalite.toString();
		
		System.out.println(personalite.toString());
		
		
		ContaCorrenteEspecial nuConta = new ContaCorrenteEspecial();
		
		nuConta.setInvestimento(15000);
		nuConta.setCartaoCredito(240000);
		nuConta.setRendimento(14000000);
		nuConta.setAgencia(1414545);
		nuConta.setNumero(11414965);
		nuConta.setTitular("Luiz");
		nuConta.setTipo("Super Premium");
		nuConta.setSaldo(1500000000);
		nuConta.toString();
		
		System.out.println(nuConta.toString());
				
		
	
	
	}

	
	

		
	
	
	



}