package esercizi.banca;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int scelta = 0;

		do {
			stampaMenu();
			scelta = input.nextInt();

			switch (scelta) {
			case 1:
				System.out.println("Hai scelto di inserire un nuovo cliente!");
				inserisciCliente();
				break;
			default:
				System.out.println("La scelta che hai effettuato non è corretta!");
				break;
			}
			System.out.println("\n\n");
		} while (scelta != 0);
	}

	public static void stampaMenu() {
		System.out.println("Ciao! Scegli l'operazione che vuoi fare:");
		System.out.println("1. Inserisci un cliente");
		System.out.println("2. Stampa tutti i clienti");
		System.out.println("0. Esci");
	}
	
	public static void inserisciCliente() {
		String nome, cognome;
		double saldo;
		
		System.out.println("Inserisci il nome: ");
		nome = input.next();
		
		System.out.println("Inserisci il cognome: ");
		cognome = input.next();
		
		System.out.println("Inserisci il saldo iniziale: ");
		saldo = input.nextDouble();
	}
}
