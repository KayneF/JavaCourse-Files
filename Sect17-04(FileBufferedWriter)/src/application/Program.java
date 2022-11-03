package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		/**
		 * O "FileWriter", pode ser instanciado de duas formas;
		 * Ao criarmos em uma nova instância, apenas com o argumento docaminho, 
		 * o arquivo será criado, ou sobrescrito por completo. 
		 * Caso criarmos em uma nova instância com o argumento do caminho, e um 
		 * argumento boolean (true), ele acrescenta/altera novos dados em um 
		 * arquivo já existente de mesmo nome.
		 * O "BufferedWriter", funciona da mesma forma que o "BufferedReader",
		 * porém, para escrita.
		 */
		
		String[] lines = new String[] {
				"Good morning", 
				"Good evening", 
				"Good afternoon"};
		
		String path = "/home/kayne/temp/file2.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
				System.out.println(line);
			}
			System.out.println("Lines inserted successfully");
		}
		catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
