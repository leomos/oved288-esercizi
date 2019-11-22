package esercizi;

import java.util.Scanner;

public class SommaMultipli {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero, divisore;
		
		System.out.print("Inserisci il numero a cui arrivare: ");
		numero = input.nextInt();
		
		System.out.print("Inserisci il divisore: ");
		divisore = input.nextInt();
		
		System.out.println(somma(numero, divisore));
	}
	
	private static int somma(int numero, int divisore) {
		int s = 0;
		
		for(int i = 0; i < numero; i++) {
			if(i % divisore == 0) {
				s += i;
			}
		}
		
		return s;
	}
}
