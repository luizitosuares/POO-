package principal;

public class Aula2 {
	
	public static void main(String[] args) {

		//operacoesSimples();
		Prioridades();
		
	}
	
	public static void OperacoesSimples() {
		
		char A = 'A';
		char B = 'B';
		int soma1 = A+B;
		
		int inteiro = 65;
		char caracter = (char)inteiro;
		System.out.println("A soma1 é " + soma1 + " ");
		System.out.println("O inteiro " + inteiro + " representa o caracter " + caracter);
	
	}
	
	public static void Prioridades() {
		int var1 = 2, var2 = 3;
		int soma = var1 + var2;
		double divisao = (double)var1 / (double)var2;
		System.out.print("A soma é " + soma + " ");
		System.out.println("A divisao é " + divisao);
	}

}
