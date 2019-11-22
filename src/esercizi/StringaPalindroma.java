package esercizi;

import java.util.Scanner;

public class StringaPalindroma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserisci la stringa: ");
		String s = input.nextLine();
		
		if(palindroma(s)) {
			System.out.println("La parola è palindroma");
		} else {
			System.out.println("La parola NON è palindroma");
		}
		
		input.close();
	}
	
	private static boolean palindroma(String s) {
		for(int i = (s.length()-1)/2; i >= 0; i--) {
			if(s.charAt(i) != s.charAt((s.length()-1)-i)) {
				return false;
			}
		}
		
		return true;
	}
}
