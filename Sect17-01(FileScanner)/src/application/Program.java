package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/**
		 * Para a leitura de um arquivo, é criado uma instância da
		 * classe "File", onde estará alocada o endereço do arquivo
		 * em forma de String. Em seguida esse arquivo será lido
		 * atravéz de uma instância da classe "Scanner", onde recebe
		 * o arquivo como argumento para a leitura.
		 */
		File file = new File("/home/kayne/temp/file.txt");
		Scanner scan = null;
		
		try {
			scan = new Scanner(file);
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		} 
		catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		finally {
			if (scan != null) {
				scan.close();
				System.out.println("File closed");
			}
		}
	}
}
