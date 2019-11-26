package esercizi.banca;

public class ContoCorrente {
	private Double saldo;
	public static int tasso = 5;
	
	public ContoCorrente(Double saldoIniziale) {
		this.saldo = saldoIniziale;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public String toString() {
		return "SALDO: " + this.saldo;
	}
}
