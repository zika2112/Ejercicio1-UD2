package mostrandodatos;

import java.util.Scanner;

public class Mostrandodatos {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Coloca tu nombre y apelido ");
		
		String nombre_ape = input.nextLine();
		
		System.out.println("Tu nombre es " + nombre_ape);
		
		input.close();
	}

}
