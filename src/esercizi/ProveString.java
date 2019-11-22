package esercizi;

public class ProveString {
	public static void main(String[] args) {
		String s = "Stringa di prova!";
		System.out.println(s);
		
		String frase = "Le dissi \n \"Ciao!\"";
		System.out.println(frase);
		
		String ris = "Mi rispose \"Ciao\"";
		System.out.println(ris);
		
		//stampaTreAllaVolta("Treallavoltaeganzissimo!!!");
		
		System.out.println(frase.indexOf('z'));
		System.out.println(frase.indexOf('l'));
		System.out.println(frase.indexOf('i', frase.indexOf('i')+1));
		
		System.out.println(frase.indexOf("di"));
		
		System.out.println("Prova(5+5)");
	}
	
	/**
	 * Tre
	 * all
	 * avo
	 */
	public static void stampaTreAllaVolta(String s) {
		for(int i = 0; i < s.length(); i+=3) {
			if(i+3 < s.length()) {
				System.out.println(s.substring(i, i+3));
			} else {
				System.out.println(s.substring(i, s.length()));
			}
		}
	}
}
