package esercizi.tipigenerici;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[100];
		Integer[] b = new Integer[100];
		
		List<Integer> c = new ArrayList<Integer>();
		c.add(50);
		System.out.println(c.size());
		c.clear();
		System.out.println(c.size());
		c.add(40);
		c.add(30);
		for(Integer n : c) {
			System.out.println(n);
		}
		
		List<String> c2 = new DumbList<>();
		c2.add("ciao");
		c2.add("300");
	}

}
