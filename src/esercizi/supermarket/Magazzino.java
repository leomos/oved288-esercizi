package esercizi.supermarket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import esercizi.supermarket.prodotti.Prodotto;

public class Magazzino {
	
	public static final Integer CAPIENZA = 500;
	private List<Prodotto> prodotti;
	
	public Magazzino() {
		this.prodotti = new ArrayList<>();
	}
	
	private Integer cerca(Integer codice) {
		for(int i = 0; i < prodotti.size(); i++) {
			if(prodotti.get(i).getCodice() == codice) {
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
		
		if(!presente(prodotto.getCodice())) {
			return prodotti.add(prodotto);
		} else {
			return false;
		}
	}
	
	public void rimuovi(Integer codice) {
		Integer posizioneAttuale = cerca(codice);
		
		if(posizioneAttuale > -1) {
			prodotti.remove(posizioneAttuale);
		}
	}
	
	public void stampa() {
		int i = 0;
		for(Prodotto p : prodotti) {
			System.out.println("*** Prodotto n." + i + " ***");
			p.descrivi();
			System.out.println();
			i++;
		}
	}
	
	public List<Prodotto> getProdotti() {
		return this.prodotti;
	}
}
