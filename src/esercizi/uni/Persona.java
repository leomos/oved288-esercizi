package esercizi.uni;

public class Persona {
	private String nome;
	private String indirizzo;
	
	public Persona(String nome, String indirizzo) {
		this.nome = nome;
		this.indirizzo = indirizzo;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getNome() {
		return nome;
	}
	
	public void visualizza() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Indirizzo: " + this.indirizzo);
	}
}
