package estrutura_decisao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.printf("Coloque algum n�mero inteiro: ");
		num1 = ler.nextInt();
		
		System.out.printf("Coloque outro n�mero inteiro: ");
		num2 = ler.nextInt();
		
		if (num1 > num2) {
			System.out.printf("O maior n�mero � %d", num1);
		}else if (num1 == num2) {
			System.out.printf("Os n�meros s�o id�nticos!");
		}else { 
			System.out.printf("O maior n�mero � %d", num2);
		}
		
	}

}
