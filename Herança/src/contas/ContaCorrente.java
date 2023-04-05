package contas;

public class ContaCorrente extends Conta{
	private int rendimento;

	public int getRendimento() {
		return rendimento;
	}

	public void setRendimento(int rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "ContaCorrente [rendimento=" + rendimento + ", getRendimento()=" + getRendimento() + ", getNumero()="
				+ getNumero() + ", getAgencia()=" + getAgencia() + ", getTitular()=" + getTitular() + ", getSaldo()="
				+ getSaldo() + ", getTipo()=" + getTipo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";}
}



	

