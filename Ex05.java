package entrada_saida;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		double a;
		double b;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Coloque a temperatura em graus Celsius: ");
		a = ler.nextDouble();
		
		b = (a*9/5) + 32;
		
		System.out.printf("A temperatura em Fahrenheit �: " + b );
		

	}

}
