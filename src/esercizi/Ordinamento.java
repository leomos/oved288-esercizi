package esercizi;

import java.util.Arrays;

public class Ordinamento {
	public static void main(String[] args) {
		//final int N = 6;
		
		int[] a = {3,1,0,2,4,1,0,5,5,-10,5,5,5,5};
		
		
		for(int i = 0; i < a.length; i++) {
			// trovo il minimo e lo metto in i
			int minimo = a[i]; 
			for(int j = i; j < a.length; j++) {
				if(a[j] < minimo) {
					int tmp = minimo;
					minimo = a[j];
					a[j] = tmp;
				}
			}
			a[i] = minimo;
		}
		
		Arrays.sort(a);
		
		for(int k : a) {
			System.out.println(k);
		}
		
	}
}
