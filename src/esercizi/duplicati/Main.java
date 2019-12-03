package esercizi.duplicati;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("/home/leonardo/work/etl/corsi/oved288/workspace/esercizi/src/esercizi/duplicati/prova.txt"));
			
			String line = null;
			List<String> undup = new ArrayList<>();
			
			// leggo il file riga per riga
			do {
				line = reader.readLine();
				
				if(line != null && undup.indexOf(line) == -1) {
					undup.add(line);
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
