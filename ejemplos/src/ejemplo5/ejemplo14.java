package ejemplo5;

import java.util.Scanner;

public class ejemplo14 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduzca una serie de valores pedidos a continuacion");
		double x1, x2, y1, y2, r1, r2, dist, rad, dRad;
		boolean iq, conC, er;
		//Primera circunferenca
		
		System.out.println("Punto X de la primera circunferencia");
		x1 = scn.nextDouble();

		System.out.println("Punto Y de la primera circunferencia");
		y1 = scn.nextDouble();
		
		System.out.println("Radio de la primera circunferencia");
		r1 = scn.nextDouble();

		
		//Segunda circunferencia
		
		System.out.println("Punto X de la segunda circunferencia");
		x2 = scn.nextDouble();

		System.out.println("Punto Y de la segunda circunferencia");
		y2 = scn.nextDouble();

		System.out.println("Radio de la segunda circunferencia");
		r2 = scn.nextDouble();

		
		//Calificacion de las circunferencias en dependencia de su posicion en el mapa
		
		dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		rad = r1 + r2;
		dRad = r1 - r2;
		
		System.out.println("La distancia entre las circunferencias es de " + dist);
		System.out.println("La suma de los radios de las circunferencias es de " + rad);
		System.out.println("La resta de los radios de las circunferencias es de " + dRad);
		
		if (dist == dRad || dist == -dRad) {
			iq = true;
		}else {
			iq = false;
		}
		
		if (dist == 0) {
			conC = true;
		}else {
			conC = false;
		}
		
		if (conC == true && iq == true && rad == 0) {
			System.out.println("ERROR!");
			er = true;
		}else {
			er = false;
			
		}
		
		
		
		if (dist > rad) {
			System.out.println("Las circunferencias son Exteriores");
			
		}else if (er == false && dist < rad && dist > r1 || dist > r2 && dist != rad && iq== false) {
			System.out.println("Las circunferencias son Secantes");
			
		}else if (iq == false && er == false && dist > 0 && r1 > r2 && dist < r1 || dist < r2 && conC == false ) {
			System.out.println("Las circunferencias son Interiores");
			
		}else if (dist == rad && er == false) {
			System.out.println("Las circunferencias son Tangente Exteriores");
			
		}else if (iq == true && dist > 0 && er == false) {
			System.out.println("Las circunferencias son Tangentes Interiores");
			
		}else if (conC == true && er == false) {
			System.out.println("Las circunferencias son Concentricas");
			
		}
		scn.close();
	}
}
