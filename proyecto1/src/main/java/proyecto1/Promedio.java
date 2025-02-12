package proyecto1;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		
		// se declara las variables 
		int nota1;
		int nota2;
		int nota3;

		int NotaFinal;

		
		//se le pide a l usuario escribir la nota 
		System.out.print("Ingrse la primera nota : ");
		nota1 = scanner.nextInt();

		System.out.print("Ingrese la segunda nota : ");
		nota2 = scanner.nextInt();

		System.out.print("Ingrese la tercera nota: ");
		nota3 = scanner.nextInt();
		
		
		// hago el calculo para sacar el promedio de las 3 notas 

		NotaFinal = nota1 + nota2 + nota3 / 3;
		
		// utiizo el operador ternario para hacer una condicion diciendo que si es mayor a 350 es aprobado y si no no aprobado

		var definitiva = NotaFinal >= 350 ? "aprobado " : "no aprobado";

		
		// se mostrara la nota final
		System.out.println("la nota final es: " + NotaFinal);

		// se mostrara la nota definitiva
		System.out.println("la nota definitiba es: " + definitiva);

	}

}
