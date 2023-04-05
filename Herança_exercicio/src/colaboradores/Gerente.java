package colaboradores;

public class Gerente extends Funcionario {


private int senha;
private int numeroDeSupervisionados;

public boolean autentica(int senha) {
	
	if(this.senha == senha) {
		
		System.out.println("Acesso Liberado !");
		return true;
	
	}else {
		
		System.out.println("Acesso negado");
		return false;
		
	}

}

public int getSenha() {
	return senha;
}

public void setSenha(int senha) {
	this.senha = senha;
}

public int getNumeroDeSupervisionados() {
	return numeroDeSupervisionados;
}

public void setNumeroDeSupervisionados(int numeroDeSupervisionados) {
	this.numeroDeSupervisionados = numeroDeSupervisionados;
}

@Override
public String toString() {
	return "Gerente [senha=" + senha + ", numeroDeSupervisionados=" + numeroDeSupervisionados + ", getSenha()="
			+ getSenha() + ", getNumeroDeSupervisionados()=" + getNumeroDeSupervisionados() + ", toString()="
			+ super.toString() + ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getSalario()="
			+ getSalario() + "]";
}




}





