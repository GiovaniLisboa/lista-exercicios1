package exercicios;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float temp_F;
		float temp_C;
		
		System.out.print("Entre com o valor da temperatura em Fahrenheit: ");
		temp_F = scanner.nextFloat();
		
		temp_C = 5*(temp_F-32)/9;
		
		System.out.println(temp_F+"°F = "+String.format("%.2f",temp_C)+"°C");
	}
}