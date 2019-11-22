package esercizi;

import java.util.Scanner;

public class OrdinamentoTreNumeri {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		int max, med, min;
		int n1, n2, n3;
		
		System.out.println("Inserisci il primo numero: ");
		n1 = input.nextInt();
		
		System.out.println("Inserisci il secondo numero: ");
		n2 = input.nextInt();
		
		System.out.println("Inserisci il terzo numero: ");
		n3 = input.nextInt();
		
		if(n1 < n2) {
			med = n1;
			max = n2;
		} else {
			med = n2;
			max = n1;
		}
		
		if(n3 > max) {
			min = med;
			med = max;
			max = n3;
		} else if (n3 > med) {
			min = med;
			med = n3;
		} else {
			min = n3;
		}
		
		System.out.println(max + " >= " + med + " >= " + min);
	}
}
