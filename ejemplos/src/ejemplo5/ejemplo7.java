package ejemplo5;

import java.util.Scanner;

public class ejemplo7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double raiz;
		raiz = scn.nextDouble();
		raiz = Math.sqrt(raiz);
		System.out.println("La raiz cuadrada es " + raiz);
		raiz = Math.cbrt(raiz);
		System.out.println("La raiz cubica es "+ raiz);
		scn.close();
	}
}
