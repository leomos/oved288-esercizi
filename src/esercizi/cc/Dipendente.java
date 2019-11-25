package esercizi.cc;

public class Dipendente {
	private String nome, cognome;
	private ContoCorrente cc;
	
	public Dipendente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.cc  = new ContoCorrente();
	}
	
	public void pagaStipendio(double stipendio) {
		this.cc.versa(stipendio);
	}
	
	public void descrivi() {
		System.out.println(this.nome + " " + this.cognome + ": " + this.cc.getSaldo());
	}
}
