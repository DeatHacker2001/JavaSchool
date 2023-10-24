package ejemplo5;

import java.util.Scanner;

public class ejemplo19 {
	public static void main(String[] args) {
		int x, y;// variables del bucle for
		int c, v, i;// variables del bucle while

		Scanner scn = new Scanner(System.in);

		System.out.println("Introduce un numero para saber su tabla de multiplicacion");
		x = scn.nextInt();

		for (int j = 0; j <= 10; j++) {
			y = x * j;
			System.out.println("HECHO CON FOR " + x + " * " + j + " = " + y);
		}

		System.out.println("\n");

		i = 0;
		v = x;

		while (i <= 10) {
			c = v * i;
			System.out.println("HECHO CON WHILE " + v + " * " + i + " = " + c);
			i++;
		}
		
		
		scn.close();
	}
}
