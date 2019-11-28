package esercizi.supermarket;

import java.util.Scanner;

import esercizi.supermarket.prodotti.DVD;
import esercizi.supermarket.prodotti.Farina;
import esercizi.supermarket.prodotti.Prodotto;
import esercizi.supermarket.prodotti.ProdottoPrezzato;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	static Magazzino m = new Magazzino();
	
	public static void main(String[] args) {
		m.inserisci(new DVD(1, "Verbatim", 800));
		m.inserisci(new DVD(2, "Ciao", 800));
		m.inserisci(new DVD(3, "Prova", 800));
		m.inserisci(new DVD(4, "Ciaociao", 800));
		m.inserisci(new Farina(5, "Ciaociao", "00", 500));
		m.rimuovi(3);
		m.stampa();
		m.inserisci(chiediProdotto());
		m.stampa();
		
		inventario();
	}
	
	public static Prodotto chiediProdotto() {
		Prodotto p = null;
		
		System.out.println("0. DVD");
		System.out.println("1. Farina");
		System.out.print("Scegli la tipologia di prodotto che vuoi inserire: ");
		
		int scelta = input.nextInt();
		
		
		switch(scelta) {
		case 0:
			p = new DVD(input);
			break;
		case 1:
			p = new Farina(input);
			break;
		default:
			System.out.println("Scelta errata.");
			break;
		}
		
		return p;
	}
	
	public static void inventario() {
		double somma = 0;
		
		for(Prodotto p : m.getProdotti()) {
			ProdottoPrezzato pp = p;
			somma += pp.getPrezzo();
		}
		
		System.out.println("La somma di tutti i prezzi è: " + somma);
	}
}