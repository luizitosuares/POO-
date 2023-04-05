package colaboradores;

public class Assistente {


private String diretorResponsavel;

private int registoUnico;

public String getDiretorResponsavel() {
	return diretorResponsavel;
}

public void setDiretorResponsavel(String diretorResponsavel) {
	this.diretorResponsavel = diretorResponsavel;
}

public int getRegistoUnico() {
	return registoUnico;
}

public void setRegistoUnico(int registoUnico) {
	this.registoUnico = registoUnico;
}

@Override
public String toString() {
	return "Assistente [diretorResponsavel=" + diretorResponsavel + ", registoUnico=" + registoUnico
			+ ", getDiretorResponsavel()=" + getDiretorResponsavel() + ", getRegistoUnico()=" + getRegistoUnico() + "]";
}





}
