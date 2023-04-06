package principal;

import pessoas.*;
import relatorio.Folha_Pagamento;

public class Principal {
	public static void main(String[] args) {

		
	Funcionario funcionario1 = new Funcionario();
	
	funcionario1.setSalario(100);
	funcionario1.getBonificacao();
//funcionario1.calculaSalario();
//System.out.println(funcionario1.calculaSalario);
	
	
	Gerente gerente1 = new Gerente();
	
	gerente1.setSalario(2000);
	gerente1.getBonificacao();
	
	//System.out.println("O salário do gerente1 é: " + gerente1.getSalario());
	//System.out.println("A bonificação do gerente1 é: " + gerente1.getBonificacao());
	
	
	Diretor diretor1 = new Diretor();
	
	diretor1.setSalario(1000);
	diretor1.getBonificacao();
	
	System.out.println(diretor1.getSalario() + diretor1.getBonificacao());
	
	
	
	//Polimorfismo
	
	
	Folha_Pagamento fp = new Folha_Pagamento();
	
	Funcionario f = new Gerente();
	f.setSalario(100);
	
	System.out.println("O seu bonus é: " + f.getBonificacao());
	System.out.println("Seu pagamento vai ser: " + fp.Calcula_Pagamento(f));
	
	
	Funcionario f2 = new Diretor();
	f2.setSalario(1000);
	
	System.out.println("O seu bonus é " + f2.getBonificacao());
	System.out.println("O seu salário é: " + fp.Calcula_Pagamento(f2));
	
			
	
	
	
	
	
	}
}
