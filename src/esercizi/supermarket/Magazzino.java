package esercizi.supermarket;

import java.util.ArrayList;
import java.util.List;

import esercizi.supermarket.prodotti.Prodotto;

public class Magazzino {
	
	public static final Integer CAPIENZA = 500;
	private Prodotto[] prodotti;
	private Integer numeroProdottiPresenti;
	
	public Magazzino() {
		this.prodotti = new Prodotto[this.CAPIENZA];
		this.numeroProdottiPresenti = 0;
	}
	
	private Integer cerca(Integer codice) {
		for(int i = 0; i < this.numeroProdottiPresenti; i++) {
			if(prodotti[i].getCodice() == codice) {
				return i;
			}
		}
		
		return -1;
	}
	
	private Boolean presente(Integer codice) {
		return cerca(codice) != -1;
	}
	
	/**
	 * Il seguente metodo inserisce un prodotto nel mgazzino
	 * @return true se l'inserimento è andato a buon fine
	 * @return false se l'inserimento non è andato a buon fine
	 * @param prodotto il prodotto da inserire 
	 */
	public Boolean inserisci(Prodotto prodotto) {
		if(prodotto == null) {
			return false;
		}
		
		if(this.numeroProdottiPresenti < this.CAPIENZA && !presente(prodotto.getCodice())) {
			this.prodotti[this.numeroProdottiPresenti] = prodotto;
			this.numeroProdottiPresenti++;
			return true;
		} else {
			return false;
		}
	}
	
	public void rimuovi(Integer codice) {
		Integer posizioneAttuale = cerca(codice);
		
		if(posizioneAttuale > -1) {
			prodotti[posizioneAttuale] = prodotti[numeroProdottiPresenti-1];
			prodotti[numeroProdottiPresenti-1] = null;
			numeroProdottiPresenti--;
		}
	}
	
	public void stampa() {
		for(int i = 0; i < numeroProdottiPresenti; i++) {
			System.out.println("*** Prodotto n." + i + " ***");
			prodotti[i].descrivi();
			System.out.println();
		}
	}
	
	public List<Prodotto> getProdotti() {
		List<Prodotto> l = new ArrayList<>();
		
		for(int i = 0; i < this.numeroProdottiPresenti; i++) {
			l.add(prodotti[i]);
		}
		
		return l;
	}
}
