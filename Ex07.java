package entrada_saida;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double d;
		double e;
		
		double total;
		double pago;
		double troco;

		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Coloque o valor do produto 1: ");
		a = ler.nextDouble();
		
		System.out.printf("Coloque o valor do produto 2: ");
		b = ler.nextDouble();
		
		System.out.printf("Coloque o valor do produto 3: ");
		c = ler.nextDouble();
		
		System.out.printf("Coloque o valor do produto 4: ");
		d = ler.nextDouble();

		System.out.printf("Coloque o valor do produto 5: ");
		e = ler.nextDouble();
		
		total = a+b+c+d+e;
		
		System.out.printf("O total deu R$%.2f", total);
		
		System.out.printf("\nPagamento: ");
		pago = ler.nextDouble();
		
		troco = pago-total;
		
		System.out.printf("Seu troco � de: R$%.2f", troco);
		
		
		
		
	}

}
