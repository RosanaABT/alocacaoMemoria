package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de pessoas: ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		double media;
		double somaAltura = 0.0;
		
		System.out.println("Digite a altura de "+ n + " pessoas:");
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
			somaAltura += vect[i];
		}
		
		media = somaAltura / n;
		System.out.printf("Altura média das pessoas: %.2f.%n", media);
		sc.close();
	}

}
