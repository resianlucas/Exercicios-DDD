package estrutura_decisao;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double altura;
		double peso;
	
		double imc;
		
		System.out.printf("Informe a sua altura em metros: ");
		altura = ler.nextDouble();
		
		System.out.printf("Informe o seu peso em kg: ");
		peso = ler.nextDouble();
		
		imc = peso/(altura*altura);
		
		
		if (imc>18.5 && imc<24.9) {
			System.out.printf("Peso ideal");
		} else {
			System.out.printf("Peso inadequado");
		}
		
	}

}