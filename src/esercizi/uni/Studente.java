package esercizi.uni;

public class Studente extends Persona {

	private Integer matricola;
	private Integer anno;
	
	private static int ultimaMatricola = 0;
	
	public Studente(String nome, String indirizzo) {
		super(nome, indirizzo);
		
		this.matricola = ultimaMatricola;
		ultimaMatricola++;
		this.anno = 1;
	}

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public Integer getMatricola() {
		return matricola;
	}
	
	public void visualizza() {
		System.out.println("STUDENTE");
		super.visualizza();
		System.out.println("Anno di corso: " + this.anno);
	}

}
