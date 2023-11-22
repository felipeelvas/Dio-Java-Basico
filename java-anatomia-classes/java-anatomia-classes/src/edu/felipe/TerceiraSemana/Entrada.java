
package edu.felipe.TerceiraSemana;

import java.util.Scanner;

public class Entrada {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double base, altura, areaRetangulo;
		
		System.out.println("");
		System.out.println("Informe o valor da base: ");
		base = entrada.nextDouble();
		
		System.out.println("Informe o valor da altura ");
		System.out.println("");
		altura = entrada.nextDouble();
		
		areaRetangulo = base * altura;
		System.out.println("A area do retângulo de base = "+ base);
		System.out.println("e altura " + altura);
		System.out.println("é: " +areaRetangulo);
		System.out.println("");
		  

	}

}
