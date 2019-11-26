package esercizi;

public class ProvaStatic {
	private static final double PI = Math.PI;
	
	public static double calcolaAreaCerchio(double raggio) {
		return PI*(Math.pow(raggio,2));
	}
}
