package esercizi.banca;

public class Cliente {
	private String nome;
	private String cognome;
	private ContoCorrente cc;
	
	public Cliente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.cc = new ContoCorrente(0.0);
	}
	
	public Cliente(String nome, String cognome, Double saldo) {
		this.nome = nome;
		this.cognome = cognome;
		this.cc = new ContoCorrente(saldo);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void descrivi() {
		System.out.println(this.nome + " " + this.cognome + " - " + this.cc.getSaldo());
	}
	
 }
