package estrutura_decisao;

import java.util.Scanner;

public class Ex15{

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Vamos criar um tri�ngulo");
		
		System.out.printf("Digite o tamanho da base: ");
		a = ler.nextInt();
		
		System.out.printf("Digite tamanho de um dos lados: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o tamanho do outro lado: ");
		c = ler.nextInt();
		
		if (a+b>c) {
			if (b+c>a) {
				if (c+a>b) {}
			}
		}else {
			System.out.println("Isso n�o � um tri�ngulo");
		}
		if (a != b && b != c && c!= a)
			System.out.printf("Esse � um tri�ngulo escaleno!");
		else if (a == b && b == c && c== a) {
			System.out.printf("Esse � um tri�ngulo equil�tero!");
		}else { 
			System.out.printf("Esse � um tri�ngulo is�celes!");
			{
		
				}
		}

	}
}