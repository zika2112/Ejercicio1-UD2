package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("coloca un numero para sumar");
		int num1 = input.nextInt();
		System.out.println("coloca otro numero para sumar");
		int num2 = input.nextInt();
		
		int suma = num1 + num2;
		
		System.out.println("La suma de los numeros es : " + suma);
input.close();
	}

}
