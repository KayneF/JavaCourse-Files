package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a file path: " );
		String strPath = scan.nextLine();
		
		File path = new File(strPath);
		
		// Função que coleta e isola o nome do arquivo/pasta sem o caminho
		System.out.println("getName: " + path.getName());
		
		// Função que coleta e isola o diretório do arquivo/pasta
		System.out.println("getParent: " + path.getParent());
		
		// Função que coleta o caminho do diretório e arquivo
		System.out.println("getPath: " + path.getPath());
		
		scan.close();
	}
}
