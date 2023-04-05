package rh;

import colaboradores.*;

public class Rh {

	public static void main(String[] args) {


		
		Funcionario funcionario1 = new Funcionario();
				
				funcionario1.setCpf("141414");
				funcionario1.setNome("Cecilia");
				funcionario1.setSalario(21000);
				funcionario1.toString();
				
				System.out.println(funcionario1.toString());
		


				Gerente gerente1 = new Gerente();
				
				
				gerente1.setNome("Thais");
				gerente1.setCpf("124545445");
				gerente1.setSalario(15000);
				gerente1.setNumeroDeSupervisionados(12);	
				gerente1.setSenha(1414141);
				gerente1.toString();
				
				
				System.out.println(gerente1.toString());
				
				
				Diretor diretor1 = new Diretor();
				
				diretor1.setNome("Marcelo");
				diretor1.setCpf("12121212");
				diretor1.setSenha(14141414);
				diretor1.setAtivosGerados(1500000000);
				diretor1.toString();
				
				System.out.println(diretor1.toString());
						
				
						
						
						
	
	
	
	}


		
	




}
