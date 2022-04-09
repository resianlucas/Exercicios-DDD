package estrutura_decisao;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		double a, t, Vi, Vf;
		
		System.out.printf("Digite a velocidade inicial do ve�culo (em m/s): ");
		Vi = ler.nextDouble();
		
		System.out.printf("Digite a acelera��o do ve�culo(em m/s�): ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o tempo(em segundos)gasto pelo ve�culo para completar o percurso: ");
		t = ler.nextDouble();
		
		Vf = Vi + (a * t);
		
		Vf =  Vf * 3.6;
		
		System.out.printf("A velocidade do ve�culo em km/h �: %.1f", Vf);
		
		if( Vf < 40) {
			System.out.println("\nVe�culo muito lento");
		}
		else if(40 < Vf && Vf <= 60) {
			System.out.println("\nVelocidade permitida");
		}
		else if(60 < Vf && Vf <= 80) {
			System.out.println("\nVelocidade de cruzeiro");
		}
		else if(80 < Vf && Vf <= 120) {
			System.out.println("\nVe�culo r�pido");
		}
		else {
			System.out.println("\nVe�culo muito r�pido");
		}
		
	}
	
}		