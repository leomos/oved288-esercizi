package esercizi.supermarket.prodotti;

import java.util.Scanner;

public class Farina extends Prodotto {

	private String tipo;
	private Integer peso; // peso in grammi, per questo Integer
	
	public Farina(Scanner input) {
		super(input);
		
		System.out.println("Inserisci il tipo: ");
		this.tipo = input.next();
		
		System.out.println("Inserisci il peso: ");
		this.peso = input.nextInt();
	}
	
	public Farina(Integer codice, String produttore, String tipo, Integer peso) {
		super(codice, produttore);
		this.tipo = tipo;
		this.peso = peso;
	}

	public String getTipo() {
		return this.tipo;
	}

	public Integer getPeso() {
		return this.peso;
	}

	@Override
	public void descrivi() {
		System.out.println("CODICE: " + this.codice);
		System.out.println("Farina");
		System.out.println("Produttore: " + this.produttore);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Peso: " + this.peso);
	}
}
