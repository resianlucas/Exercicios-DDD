package estrutura_decisao;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Digite o primeiro n�mero: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo n�mero: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o terceiro n�mero: ");
		c = ler.nextInt();
		
		if (a>b) {
			if (a>c)
				System.out.println("O maior n�mero �: " + a);
			else 
				System.out.println("O maior n�mero �: " + c);
			}else {
				if (b>c)
					System.out.println("O maior n�mero �: " + b);
				else 
					System.out.println("O maior n�mero �: " + c);
		}
		

	}

}
