package exercicios;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int inteiro1;
		int inteiro2;
		double real;
		
		System.out.print("Insira o valor do primeiro numero inteiro: ");
		inteiro1 = scanner.nextInt();
		System.out.print("Insira o valor do segundo numero inteiro: ");
		inteiro2 = scanner.nextInt();
		System.out.print("Insira o valor do numero real: ");
		real = scanner.nextDouble();
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: "+(2*inteiro1*(inteiro2/2)));
		System.out.println("A soma do triplo do primeiro com o terceiro: "+(3*inteiro1+real));
		System.out.println("O terceiro elevado ao cubo: "+(real*real*real));
	}

}
