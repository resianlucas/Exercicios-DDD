package entrada_saida;

import java.util.Scanner;


public class Ex06 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Coloque a cota��o atual do d�lar hoje: ");
		a = ler.nextDouble();
		
		System.out.printf("Coloque o valor em d�lar: ");
		b = ler.nextDouble();
		
		c = a*b;
				
		System.out.printf("A quantia em real � %.2f", c);
		
	
 }
}