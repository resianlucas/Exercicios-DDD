package entrada_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int aresta;
		
		System.out.println("�rea de um quadrado");
		
		System.out.println("Digite o valor da aresta: ");
		aresta = ler.nextInt();
	
		
		double area;
		
		area = aresta*aresta;
		
		System.out.printf("A �rea do ret�ngulo � %.2f", area);
	}

}

