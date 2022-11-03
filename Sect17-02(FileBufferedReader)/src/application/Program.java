package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	
	/**
	 * Para a leitura de dados de arquivos alocados em disco, são 
	 * utilizados "FileReader" e "BufferedReader", ambos tem o 
	 * propósito semelhante, porém são utilizados em questões 
	 * diferentes, e ambos possuem seus pros e contras.
	 * Em resumo, o "BufferedReader" possui um buffer interno onde 
	 * guarda as informações para leitura, o que o faz ter um melhor 
	 * desempenho e eficiência. Ele também é capaz de ler linhas 
	 * inteiras guardadas em buffer, diferente do "FileReader" que 
	 * só é capaz de ler um único caractere por vez, já que o mesmo
	 * acessa o arquivo diretamente do disco. Outra diferença. é que
	 * o BufferedReader não é atrelado somente a leitura de arquivos, 
	 * mas também pode ser usado para ler dados de qualquer fluxo de 
	 * caracteres arquivos.
	 */

	public static void main(String[] args) {
		
		String path = "/home/kayne/temp/file.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
