package esercizi.banca;

public class ContoCorrente {
	private Double saldo;
	
	public ContoCorrente(Double saldoIniziale) {
		this.saldo = saldoIniziale;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
}
