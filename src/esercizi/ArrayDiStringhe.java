package esercizi;

public class ArrayDiStringhe {
	public static void main(String[] args) {
		String[] nomi = {"Giovanni", "Francesco"};
		
		for(int i = 0; i < nomi.length; i++) {
			String nome = nomi[i];
			System.out.println(nome);
		}
		
		for(String nome : nomi) {
			System.out.println(nome);
		}
	}
}
