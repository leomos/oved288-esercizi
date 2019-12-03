package esercizi.duplicati;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("/home/leonardo/work/etl/corsi/oved288/workspace/esercizi/src/esercizi/duplicati/prova.txt"));
			
			String line = null;
			Set<String> undup = new HashSet<>();
			
			// leggo il file riga per riga
			do {
				line = reader.readLine();
				
				if(line != null) {
					String lineTrimmed = line.trim();
					undup.add(lineTrimmed);
				}
			} while(line != null);
			
			// stampo tutto ciò che è dentro la lista
			for(String s : undup) {
				System.out.println(s);
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
