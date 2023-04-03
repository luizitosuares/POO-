package Imput;
import java.util.Scanner;

public class calculo {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    double numero1, numero2;
    System.out.println("Digite o numero que você quer:");
    numero1 = scanner.nextDouble();
    System.out.println("Digite o segundo número:");
    numero2 = scanner.nextDouble();
    scanner.close();
   
    double soma, sub, div, mult; 
    soma = numero1 + numero2;
    sub = numero1 - numero2;
    div = numero1 / numero2;
    mult = numero1 * numero2;
    
    System.out.println("A soma é: " + soma);
    System.out.println("A subtração é: " + sub);
    System.out.println("A divisão é: " + div);
    System.out.println("A multiplicação é: " + mult);
    
    

	
	}

}







