package esercizi.banca;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	static int numeroClienti = 0;
	static Cliente[] clienti = new Cliente[100];
	
	public static void main(String[] args) {
		int scelta = 0;

		do {
			stampaMenu();
			scelta = input.nextInt();

			switch (scelta) {
			case 0:
				System.out.println("Arrivederci.");
				break;
			case 1:
				System.out.println("Hai scelto di inserire un nuovo cliente!");
				inserisciCliente();
				break;
			case 2:
				System.out.println("Clienti presenti nella banca: ");
				stampaClientiSenzaDescrivi();
				break;
			case 3:
				System.out.println("Scegli il cliente che vuoi modificare:");
				modificaCliente();
			default:
				System.out.println("La scelta che hai effettuato non è corretta!");
				break;
			}
			System.out.println("\n");
		} while (scelta != 0);
	}

	public static void stampaMenu() {
		System.out.println("Ciao! Scegli l'operazione che vuoi fare:");
		System.out.println("1. Inserisci un cliente");
		System.out.println("2. Stampa tutti i clienti");
		System.out.println("3. Modifica cliente");
		System.out.println("0. Esci");
	}
	
	public static void inserisciCliente() {
		String nome, cognome;
		Cliente c;
		
		System.out.println("Inserisci il nome: ");
		nome = input.next();
		
		System.out.println("Inserisci il cognome: ");
		cognome = input.next();
		
		c = new Cliente(nome, cognome);
		clienti[numeroClienti] = c; 
		numeroClienti++;
	}
	
	public static void stampaClienti() {
		for(int i = 0; i < numeroClienti; i++) {
			System.out.print(i + " - ");
			clienti[i].descrivi();
		}
	}
	
	public static void stampaClientiSenzaDescrivi() {
		for(int i = 0; i < numeroClienti; i++) {
			System.out.println(clienti[i].getNome() + " " + clienti[i].getCognome());
		}
	}
	
	public static void modificaCliente() {
		stampaClienti();
		
		int indiceCliente = input.nextInt();
		
		System.out.println("Inserisci il nuovo nome");
		String nome = input.next();
		
		System.out.println("Inserisci il nuovo cognome");
		String cognome = input.next();
		
		clienti[indiceCliente].setNome(nome);
		clienti[indiceCliente].setCognome(cognome);
	}
}
