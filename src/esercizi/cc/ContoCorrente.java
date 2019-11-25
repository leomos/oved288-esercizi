package esercizi.cc;

public class ContoCorrente {

	private double saldo;
	
	public void versa(double s) {
		this.saldo += s;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
