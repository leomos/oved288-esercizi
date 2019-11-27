package esercizi.uni;

public class Main {

	public static void main(String[] args) {
		Studente s1 = new Studente("Mario Rossi", "Piazza la bomba e scappa");		
		Professore p1 = new Professore("Mario Gialli", "Via Le Mani dal Naso", 390);

		
		Persona[] persone = new Persona[100];
		persone[0] = s1;
		persone[1] = p1;
		
		for(int i = 0; i < 2; i++) {
			persone[i].visualizza();
		}
	}

}
