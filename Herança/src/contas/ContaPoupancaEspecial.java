package contas;

public class ContaPoupancaEspecial extends ContaPoupanca {

	private double cartaoDebito;

	public double getCartaoDebito() {
		return cartaoDebito;
	}

	public void setCartaoDebito(double cartaoDebito) {
		this.cartaoDebito = cartaoDebito;
	}

	@Override
	public String toString() {
		return "ContaPoupancaEspecial [cartaoDebito=" + cartaoDebito + ", getCartaoDebito()=" + getCartaoDebito()
				+ ", getTarifa()=" + getTarifa() + ", getLimite()=" + getLimite() + ", toString()=" + super.toString()
				+ ", getNumero()=" + getNumero() + ", getAgencia()=" + getAgencia() + ", getTitular()=" + getTitular()
				+ ", getSaldo()=" + getSaldo() + ", getTipo()=" + getTipo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


	
	

}
