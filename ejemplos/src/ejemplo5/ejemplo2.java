package ejemplo5;
import java.util.Scanner;

public class ejemplo2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name, aS,bS;
		double a;
		int b;

		System.out.println("Introduce un numero flotante");
		aS = scn.nextLine();
		a = Double.parseDouble(aS);
		
		System.out.println("El numero es " + a);
		
		System.out.print("Introduzca un número entero: ");
		bS = scn.nextLine();
		b = Integer.parseInt(bS);
		System.out.println("El cuadrado es: " + Math.pow(b,2));
		
		System.out.print("Introduce tu nombre: \n");
		name = scn.nextLine(); // scn = metodo!
		System.out.println("Hola " + name);
		
		scn.close();
	}
	
}
