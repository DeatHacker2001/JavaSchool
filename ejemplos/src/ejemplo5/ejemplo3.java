package ejemplo5;

import java.util.Scanner;

public class ejemplo3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int h, m ,hm;
		System.out.println("Introduce una cantidad de min para trasformarlo en Horas: ");
		System.out.print("Introduce los minutos: ");
		m = scn.nextInt();
		h = m / 60; 
		hm = m % 60;
		System.out.print("\nSon " + h + " horas con " + hm + " minutos");
		scn.close();
		

	}
}
