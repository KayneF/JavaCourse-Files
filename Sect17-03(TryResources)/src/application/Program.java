package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		/**
		 * "try resources", é uma forma onde, quando abrimos um bloco
		 * "try", conseguimos declarar um ou mais recursos na abertura
		 * do bloco, e com isso, se torna desnecessário a declaração 
		 * de variáveis com certos propósitos, e nesse caso, utilizamos
		 * "FileReader" e "BufferedReader" como recursos.
		 * Outro detalhe interessante, é, que ao final do bloco, os 
		 * recursos são desalocados automaticamente no fechamento do 
		 * bloco, o que torna desnecessário a utilização de um bloco
		 * "finally" para esse propósito, tornando o código mais
		 * "enchuto" e de fácil visualização.
		 */
		
		String path = "/home/kayne/temp/file.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
