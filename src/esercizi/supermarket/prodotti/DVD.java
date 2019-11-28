package esercizi.supermarket.prodotti;

import java.util.Scanner;

public class DVD extends Prodotto {

	private Integer capacita;
	
	public DVD(Integer codice, String produttore, Integer capacita) {
		super(codice, produttore);
		this.capacita = capacita;
	}
	
	public DVD(Scanner input) {
		super(input);
		
		System.out.println("Inserisci la capacita: ");
		this.capacita = input.nextInt();
	}

	public Integer getCapacita() {
		return this.capacita;
	}

	@Override
	public void descrivi() {
		System.out.println("CODICE: " + this.codice);
		System.out.println("DVD");
		System.out.println("Produttore: " + this.produttore);
		System.out.println("Capacità: " + this.capacita);
	}
}
