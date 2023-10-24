package ejemplo5;

import java.util.Scanner;

public class ejemplo4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas (se\r\n"
				+ "incrementa su sueldo en un 10% de la cantidad vendida), el vendedor desea saber cuánto\r\n"
				+ "dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes y el\r\n"
				+ "total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.");
		int sueldoBase, sueldoVentas, comision, total;
		System.out.println("Cual es el sueldo base del trabajador?\r\n" + "Introduce un sueldo base:");
		sueldoBase = scn.nextInt();
		System.out.println(
				"Cuanto dinero hizo el trabajador?\r\n" + "Introduce la cantidad de dinero generado con las ventas:");
		sueldoVentas = scn.nextInt();

		comision = (sueldoVentas * 10) / 100;
		total = comision + sueldoBase;
		System.out.println("La comision del vendedor es de " + comision + "€ y el total seria " + total + "€");
		
		scn.close();
		
	}
}
