package esercizi;

public class Wrappers {
	public static void main(String[] args) {
		double numero = 103.3;
		Double numeroWrapper = numero;
		
		int numeroIntero = (int) numero;
		int numeroInteroFromWrapper = numeroWrapper.intValue();

		System.out.println(numero);
		System.out.println(numeroWrapper);
		System.out.println(numeroIntero);
		System.out.println(numeroInteroFromWrapper);
		
		/*
		 * int -> Integer
		 * double -> Double
		 * char -> Character
		 * short -> Short
		 * byte -> Byte
		 */
	}
}
