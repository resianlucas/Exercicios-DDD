package entrada_saida;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double num1, num2, num3, num4;
		
		System.out.println("M�dia aritm�tica");
		System.out.printf("Digite o primeiro n�mero: ");
		num1 = ler.nextDouble();
		System.out.printf("Digite o segundo n�mero: ");
		num2 = ler.nextDouble();
		System.out.printf("Digite o terceiro n�mero: ");
		num3 = ler.nextDouble();
		System.out.printf("Digite o quarto n�mero: ");
		num4 = ler.nextDouble();
		
		double media;
		
		media = (num1+num2+num3+num4)/4;
		
		System.out.printf("A m�dia aritm�tica �: %.2f", media);
		
		
		
		
	}

}
