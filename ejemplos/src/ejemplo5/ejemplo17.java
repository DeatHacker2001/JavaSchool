package ejemplo5;

import java.util.Scanner;

public class ejemplo17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a,b= 0, c= 0, d = 0;
		System.out.println("Introduce un 0 para cancelar el programa y numeros para hallar su media");
		a = scn.nextInt();
		while (a != 0) {
			b = a + b;
			System.out.println("b = " + b);
			c++;
			System.out.println("c = "+ c);
			System.out.println("Introduce un 0 para cancelar el programa y numeros para hallar su media");
			a = scn.nextInt();
		}
		d = b / c;
		System.out.println("La media es " + d);
		
		
	}
}
