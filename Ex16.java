package estrutura_decisao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double num1, num2, num3;
		
		System.out.println("Vamos criar um tri�ngulo ret�ngulo");
		
		System.out.printf("Digite o primeiro n�mero: ");
		num1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo n�mero: ");
		num2 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro n�mero: ");
		num3 = ler.nextDouble();
		
		if((num3 * num3) == (num1 * num1) + (num2 * num2) || (num1 * num1) == (num3 * num3) + (num2 * num2) || (num2 * num2) == (num3 * num3) + (num1 * num1)){
			System.out.printf("� um tri�ngulo ret�ngulo.");			
		} else {
			System.out.printf("N�o � um tri�ngulo ret�ngulo.");
		}
		
	}

}