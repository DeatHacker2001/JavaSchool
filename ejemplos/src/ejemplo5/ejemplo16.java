package ejemplo5;

import java.util.Scanner;

public class ejemplo16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t1, t2;
		double pInicial, g;
		char tipo;

		System.out.println("Introduce un tipo de uva que desa");
		tipo = scn.next().charAt(0);
		System.out.println("tamaño");
		t1 =scn.nextInt();
		System.out.println("Tamaño");
		t2 = scn.nextInt();
		System.out.println("price");
		pInicial = scn.nextDouble();
		
		g = 0;
		double a = 0.30d;
		
		if (tipo == 'A') {
			g = pInicial + 0.20d;
			if (t2 == 2) {
				g = pInicial + a;
			}
			System.out.println("La ganancia es:");
			
			
		}else if (tipo == 'B') {
			if (t1 == 1) {
				g = pInicial - a;
			}else if (t2 == 2) {
				g = pInicial - 0.50d;
			}
			
		}
		System.out.println("La ganancia es : " + g);
	}
}
