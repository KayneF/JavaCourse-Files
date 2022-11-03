package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a name for the folder path: ");
		String strPath = scan.nextLine();
		
		File path = new File(strPath);
		
		// Lista todas as pastas do diretório
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("\nFOLDERS IN DIRECTORY: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// Lista todos os arquivos do diretório
		File[] files = path.listFiles(File::isFile);
		System.out.println("\nFILES IN DIRECTORY: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		// Cria uma nova pasta através do diretório apontado
		System.out.print("\nName the new folder: ");
		String dir = scan.nextLine();		
		boolean success = new File(strPath + "/" + dir).mkdir();
		
		if (success) {
			System.out.println("Directory created successfully.");
		}
		else {
			System.out.println("Directory could not be created.");
		}
		
		
		scan.close();
	}

}
