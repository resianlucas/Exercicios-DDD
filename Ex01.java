package entrada_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double base, altura;
		
		System.out.println("�rea de um ret�ngulo");
		
		System.out.println("Digite o valor da base: ");
		base = ler.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = ler.nextDouble();
		
		double area;
		
		area = base*altura;
		
		System.out.printf("A �rea do ret�ngulo � %.2f", area);
	}

}
