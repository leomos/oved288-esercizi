package esercizi.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("p.csv"));
			
			String line = null;
			
			// leggo il file riga per riga
			do {
				line = reader.readLine();
				
				if(line != null) {
					String lineTrimmed = line.trim();
					String[] values = lineTrimmed.split(";");
					System.out.print(values[0]);
					System.out.print(values[1]);
					System.out.print(values[2]);
					System.out.println();
				}
			} while(line != null);
			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
