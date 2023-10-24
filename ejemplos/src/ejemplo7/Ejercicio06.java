package ejemplo7;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Selecciona una de las siguientes opciones :\r"
				+ "1. Triangulo\r"
				+ "2. Circulo\r"
				+ "3. Rectangulo\r");
		int numSelectedInMenu = scn.nextInt();
		
		selectedMenu(numSelectedInMenu, scn);
		
		scn.close();
	}
	private static void selectedMenu(int select, Scanner scn) {
		float x = 0, x1 = 0, y = 0;
		
		switch (select) {
		case 1:
			showTriangle(scn, x, x1, y);
			break;
		case 2:
			showCir(scn, x);
			break;
		case 3:
			showRect(scn, x, x1);
			break;

		default:
			
			break;
		}

	}
	private static void showTriangle(Scanner scn, float x,float x1, float y) {
		System.out.print(""
				+ "     											                                              \r\n"
				+ "                                              ██▒                                             \r\n"
				+ "                                             ████▒                                            \r\n"
				+ "                                            ██████▒                                           \r\n"
				+ "                                           ▓████████░                                         \r\n"
				+ "                                          ▓▓█████████░                                          \r\n"
				+ "                                         ▓▓▓▓▓████████░                                        \r\n"
				+ "                                        ▓▓▓▓▓▓▓▓▓▓█████▒                                     \r\n"
				+ "                                       ▓▓▓▓▓▓▓▓▓▓▓██████▒                                     \r\n"
				+ "                                      ▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▒                                    \r\n"
				+ "                                     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▒                                    \r\n");
		
		System.out.print("Introduce la distancia de un lado del triangulo \r" + ">");
		x = scn.nextFloat();
		
		System.out.print("Introduce la distancia de otro lado del triangulo \r" + ">");
		x1 = scn.nextFloat();
		
		System.out.print("Introduce la distancia de otro lado del triangulo \r" + ">");
		y = scn.nextFloat();
		
		float p  = x+x1+y/ 2;
		double a = Math.cbrt(p * (p-x) * (p - x1) * (p - y));
		System.out.println("El area del triangulo es de " + a);
	}
	private static void showCir(Scanner scn, float x) {
		
		System.out.print(""
				+ "         , - ~ ~ ~ - ,\r\n"
				+ "     , '               ' ,\r\n"
				+ "   ,                       ,\r\n"
				+ "  ,                         ,\r\n"
				+ " ,                           ,\r\n"
				+ " ,                           ,\r\n"
				+ " ,                           ,\r\n"
				+ "  ,                         ,\r\n"
				+ "   ,                       ,\r\n"
				+ "     ,                  , '\r\n"
				+ "       ' - , _ _ _ ,  '\r\n"
				+ "");
		
		System.out.print("Introduce el radio del circulo \r" + ">");
		x = scn.nextFloat();
		
		double a = Math.PI * Math.pow(x, 2);
		System.out.println("El area del triangulo es de " + a);

	}
	private static void showRect(Scanner scn, float x,float x1) {
		
		System.out.print(""
				+ "	███████████████████████████		\r\n"
				+ "	███████████████████████████		\r\n"
				+ "	███████████████████████████		\r\n"
				+ "	███████████████████████████		\r\n"
				+ "	███████████████████████████		\r\n");
		
		System.out.print("Introduce un lado del rectangulo \r" + ">");
		x = scn.nextFloat();
		
		System.out.print("Introduce otro lado del rectangulo \r" + ">");
		x1 = scn.nextFloat();
		
		double a = x * x1;
		System.out.println("El area del triangulo es de " + a);


	}
}
