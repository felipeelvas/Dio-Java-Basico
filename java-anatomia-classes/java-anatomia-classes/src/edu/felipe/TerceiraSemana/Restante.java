package edu.felipe.TerceiraSemana;

import java.util.Scanner;

public class Restante {
	public static void main(String[] args) {
	// Operador '%' ue permite obter o resto de uma divisão
		// int x = 15 % 5;
		// int y = 12 % 5;
		// int z = 14 % -5;

		// System.out.println("O resto da divisão x é: " + x);
		// System.out.println("O resto da divisão y é: " + y);
		// System.out.println("O resto da divisão z é: " + z);
			Scanner input = new Scanner(System.in);
				System.out.println("insita um valor em gramas: ");
				int gramas = input.nextInt();

				int kilos = gramas / 1000;
				gramas = gramas % 1000;

			System.out.println("O tatal de kilos é = " + kilos);
	
			System.out.println("O tatal de gramas é = " +gramas);

	}
}
