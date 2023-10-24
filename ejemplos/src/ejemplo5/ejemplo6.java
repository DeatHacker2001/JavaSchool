package ejemplo5;

import java.util.Scanner;

public class ejemplo6 {
	public static void main(String[] args) {
		// En resolucion del ejercicio 12
		Scanner scn = new Scanner(System.in);
		double x1, x2, y1, y2, d;
		System.out.println(
				"El usuario debe de introducir unas cordenadas de tal forma que el porgrama hallara la distacio entre estos 2 puntos en un plano de 2 dimenciones \r\n"
						+ "Introduce x1:");
		x1 = scn.nextDouble();
		System.out.println("Introduce x2:");
		x2 = scn.nextDouble();
		System.out.println("Introduce y1:");
		y1 = scn.nextDouble();
		System.out.println("Introduce y2:");
		y2 = scn.nextDouble();

		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("La distancia es " + d);
		scn.close();
	}
}
