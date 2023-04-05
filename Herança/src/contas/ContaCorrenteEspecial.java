package contas;

public class ContaCorrenteEspecial extends ContaCorrente  {

private double cartaoCredito;
private double investimento;



public double getInvestimento() {
	return investimento;
}
public void setInvestimento(double investimento) {
	this.investimento = investimento;
}
public double getCartaoCredito() {
	return cartaoCredito;
}
public void setCartaoCredito(double cartaoCredito) {
	this.cartaoCredito = cartaoCredito;
}
@Override
public String toString() {
	return "ContaCorrenteEspecial [cartaoCredito=" + cartaoCredito + ", investimento=" + investimento
			+ ", getInvestimento()=" + getInvestimento() + ", getCartaoCredito()=" + getCartaoCredito()
			+ ", getRendimento()=" + getRendimento() + ", toString()=" + super.toString() + ", getNumero()="
			+ getNumero() + ", getAgencia()=" + getAgencia() + ", getTitular()=" + getTitular() + ", getSaldo()="
			+ getSaldo() + ", getTipo()=" + getTipo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ "]";
}




}
