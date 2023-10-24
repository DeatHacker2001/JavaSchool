package ejemplo5;

import java.util.Scanner;

public class ejemplo20 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x, y ,i = 1, may = 0, men = 0, ig = 0;
		int k = 0;
		
		System.out.println("Introduce una cantidad de numeros para luego comparar");
		y = scn.nextInt();
		
		do {
			System.out.println("DOOOOOOOO");
			k++;
		} while (k > 5);
		
		while (i <= y) {
			System.out.println("Introduce un numero");
			x = scn.nextInt();
			i++;
			if (x == 0) {
				ig++;
			} else if (x > 0) {
				may++;
			} else if (x < 0) {
				men++;
			}
			System.out.println("Introduce un numero");
			x = scn.nextInt();
		}
		System.out.println("La cantidad de  numeos igual a 0 es de " + ig + " mayores " + may + " menores " + men);
		scn.close();
	}
}
