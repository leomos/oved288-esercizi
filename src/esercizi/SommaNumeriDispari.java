package esercizi;

import java.util.Scanner;

public class SommaNumeriDispari {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double n = 0, somma = 0;
		
		do {
			System.out.println("Inserisci il numero: ");
			n = input.nextInt();
		} while(n < 0);
		
		if(n < 0) {
			System.out.println("Numero negativo.");
			return;
		}
		
		
		for(int i = 1; i <= n; i+=2) {
			somma += i;
		}
		System.out.println(somma);
		somma = 0;
		
		somma = Math.pow(Math.ceil(n/2),2);
		System.out.println(somma);
	}
}
