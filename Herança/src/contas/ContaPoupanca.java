package contas;

public class ContaPoupanca extends Conta  {

	private double tarifa;
	private double limite;
	
	
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public String toString() {
		return "ContaPoupanca - Tarifa =" + getTarifa()
				+ ", Limite = " + getLimite() + ", Numero = " + getNumero() + ", Agencia = " + getAgencia()
				+ ", Titular = " + getTitular() + ", Saldo = " + getSaldo() + ", Tipo = " + getTipo()
				+ ", Class = " + getClass() 
				+ "]";
	}
	
	


}

