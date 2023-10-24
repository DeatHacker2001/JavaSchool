package ejemplo5;

import java.util.Scanner;
import java.util.Random;

public class ejemplo13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();

		String name, emp;
		int nota, edad, a;

		System.out.println("Introduce el nombre del Alumno");
		name = scn.nextLine();
		System.out.println("Introduce S si esta empadronado o N si no");
		emp = scn.nextLine();
		System.out.println("Introduce la nota");
		nota = scn.nextInt();
		System.out.println("Introduce la edad");
		edad = scn.nextInt();
		
		
		
		if (nota >= 5 && edad >= 18 && emp.equalsIgnoreCase("S") && name.length() != 0) {
			System.out.println("ACEPTADA");

		} else if (nota >= 5 && edad >= 18 && emp.equalsIgnoreCase("N") && name.length() != 0) {
			System.out.println("POSIBLE");
		}else if (name.length() == 0) {
			System.out.println("Error a la hora de introducir el nombre del Alumno");
		}
		else {
			System.out.println("NO ACEPTADA");
		}

		// de la siguiente forma el valor de empadronado es ramdom

		a = rnd.nextInt(2);

		if (nota >= 5 && edad >= 18 && a == 1 && name.length() != 0) {
			System.out.println("R_ACEPTADA");

		} else if (nota >= 5 && edad >= 18 && a == 0) {
			System.out.println("R_POSIBLE");
		} else {
			System.out.println("NO ACEPTADA");
		}

		scn.close();

	}
}
