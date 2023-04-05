package colaboradores;

public class Operador_caixa extends Funcionario {
	
	private int fechamentoCaixa;
	private int fichaPonto;
	public int getFechamentoCaixa() {
		return fechamentoCaixa;
	}
	public void setFechamentoCaixa(int fechamentoCaixa) {
		this.fechamentoCaixa = fechamentoCaixa;
	}
	public int getFichaPonto() {
		return fichaPonto;
	}
	public void setFichaPonto(int fichaPonto) {
		this.fichaPonto = fichaPonto;
	}
	@Override
	public String toString() {
		return "Operador_caixa [fechamentoCaixa=" + fechamentoCaixa + ", fichaPonto=" + fichaPonto
				+ ", getFechamentoCaixa()=" + getFechamentoCaixa() + ", getFichaPonto()=" + getFichaPonto() + "]";
	}
	
	
	

}
