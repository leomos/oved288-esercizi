package esercizi.supermarket.prodotti;

import java.util.Scanner;

public abstract class Prodotto implements ProdottoPrezzato {
	protected Integer codice;
	protected String produttore;
	
	protected Double prezzo;
	
	public Prodotto(Scanner input) {
		System.out.println("Inserisci il codice: ");
		this.codice = input.nextInt();
		
		System.out.println("Inserisci il produttore: ");
		this.produttore = input.next();
		
		System.out.println("Inserisci il prezzo: ");
		this.prezzo = input.nextDouble();
	}
	
	public Prodotto(Integer codice, String produttore) {
		this.codice = codice;
		this.produttore = produttore;
		this.prezzo = 0.0;
	}
	
	public Integer getCodice() {
		return this.codice;
	}
	
	public String getProduttore() {
		return this.produttore;
	}
	
	public abstract void descrivi();
	
	@Override
	public Double getPrezzo() {
		return this.prezzo;
	}
	
	@Override
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
}
