package estrutura_decisao;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int sexo;
		double altura,peso;

		
		double imc;
		
		System.out.printf("Informe a sua altura: ");
		altura = ler.nextDouble();
		
		System.out.printf("Informe o seu peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Seu g�nero � Masculino(1) ou Feminino(2)?: ");
		sexo = ler.nextInt();
		
		imc = peso/(altura*altura);
		
		if (sexo == 1) {
			if (imc>=19 && imc<24) 
				System.out.printf("Peso ideal");
			else if (imc<19)
				System.out.printf("Abaixo do peso");
			else 
				System.out.printf("Acima do peso");
				
		}else if (sexo == 2) {
			if (imc>20 && imc<25) 
				System.out.printf("Peso ideal");
			else if (imc<20)
				System.out.printf("Abaixo do peso");
			else 
				System.out.printf("Acima do peso");
		}else {
			System.out.println("Sexo inv�lido");
		}
		
	}

}