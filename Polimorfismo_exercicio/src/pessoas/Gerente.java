package pessoas;

public class Gerente extends Funcionario {

	public double getBonificacao() {
		return super.getBonificacao() + this.getSalario() * 0.15;
	
	}

	
	
	
}
