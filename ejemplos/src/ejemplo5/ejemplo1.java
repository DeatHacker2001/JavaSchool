package ejemplo5;

import java.util.Scanner;

public class ejemplo1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Introduce 5 valores a continuacion");
		double x, y, a, b, c, res;
		System.out.println("\nIntroduce x:");
		x = (double) scn.nextInt();
		System.out.println("Introduce y:");
		y = (double) scn.nextInt();
		System.out.println("Introduce a:");
		a = (double) scn.nextInt();
		System.out.println("Introduce b:");
		b = (double) scn.nextInt();
		System.out.println("Introduce c:");
		c = (double) scn.nextInt();
		res = Math.pow(x, 2) + Math.pow(y, 2);
		System.out.println("\nLa operacion x^2 + y^2 es " + res);
		res = Math.pow(a, 2) / (Math.pow(x, 3) + Math.pow(y, 3));
		System.out.println("La operacion a^2 / (x^3 + y^3) es " + res);
		res = a + Math.pow(x, 2) / y;
		System.out.println("La operacion a + x^2 / y es " + res);
		res = (a + b) / (a + Math.pow(c, 2) / (x + y));
		System.out.println("La operacian (a + b) / (a + c^2 / (x + y)) es " + res);

		scn.close();
		a = 5d;
		b = 25d;
		c = 10d;
		res = a + b / c;
		System.out.println("\n De la ecuacion A + B / C  se obtiene " + res);		
		
		/*
		 * In the next lines of code 
		 * En las siguientes lineas de codigo podremos observar el resultado del
		 * ejercicio 2 que se encuentra en el pdf EnunciadosExpresiones.pdf
		 */
		
		System.out.println("\nA continuacion se hara una evaluacion basandose en los Datos: A es 4, B es 5 y C es 1:");
		a = 4d;
		b = 5d;
		c = 1d;
		res = b * a - b * b / 4 * c;
		System.out.println("\nSe obtiene como resultado de la evaluacion (B * A - B * B / 4 * C) = " + res);
		res = (a * b) / 3 * 3;
		System.out.println("Se obtiene de (A * B) / 3 *3 = " + res);
		res = (((b + c) / 2 * a + 10) * 3 * b) - 6;
		System.out.println("Se obtiene de ( ( ( B + C ) / 2 * A + 10 ) * 3 * B ) - 6 = " + res);
		
	}

}
