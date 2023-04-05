package colaboradores;

public class Diretor extends Gerente {
	
	private int numeroDeGerenteSupervisao;
	private int ativosGerados;
	
	
	
	public int getNumeroDeGerenteSupervisao() {
		return numeroDeGerenteSupervisao;
	}
	public void setNumeroDeGerenteSupervisao(int numeroDeGerenteSupervisao) {
		this.numeroDeGerenteSupervisao = numeroDeGerenteSupervisao;
	}
	public int getAtivosGerados() {
		return ativosGerados;
	}
	public void setAtivosGerados(int ativosGerados) {
		this.ativosGerados = ativosGerados;
	}
	@Override
	public String toString() {
		return "Diretor [numeroDeGerenteSupervisao=" + numeroDeGerenteSupervisao + ", ativosGerados=" + ativosGerados
				+ ", getNumeroDeGerenteSupervisao()=" + getNumeroDeGerenteSupervisao() + ", getAtivosGerados()="
				+ getAtivosGerados() + "]";
	}
	
	

	
	}

