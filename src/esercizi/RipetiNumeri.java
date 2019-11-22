package esercizi;

import java.util.Scanner;

public class RipetiNumeri {
	public static void main(String[] args) {
		final int N = 3;
		Scanner input = new Scanner(System.in);
		
		int numeri[] = new int[N];
		
		System.out.println("Inserisci i " + N + " numeri: ");
		
		
		for(int i = 0; i < N; i++) {
			int[] n = numeri;
			n[i] = input.nextInt();
		}
		
		for(int numero : numeri) {
			System.out.println(numero);
		}
	}
}
