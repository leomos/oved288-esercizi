package esercizi.uni;

public class Professore extends Persona {

	private int codice;
	
	public Professore(String nome, String indirizzo, int codice) {
		super(nome, indirizzo);
		this.codice = codice;
	}
	
	public void visualizza() {
		System.out.println("PROFESSORE");
		super.visualizza();
		System.out.println("Codice Professore: " + this.codice);
	}

}
