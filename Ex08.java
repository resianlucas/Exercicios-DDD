package estrutura_decisao;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.printf("Coloque um n�mero inteiro: ");
		num1 = ler.nextInt();
		
		System.out.printf("Coloque outro n�mero inteiro: ");
		num2 = ler.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior n�mero �: " + num1);
		}else { System.out.println("O maior n�mero �: " + num2);
		
		}
		
	}

}
