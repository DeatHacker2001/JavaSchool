package ejemplo7;
import java.util.Scanner;
public class Ejercicio04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Escribe tu nombre y a continuacion una edad:");
		String name = readLine(scn);
		String edad = readLine(scn);
		
		
		if (!edad.isEmpty()) {
			int e = Integer.parseInt(edad);
			bucle(name, e);
		}else{
			bucle(name);
		}
		
		
		
	}
	
	public static String readLine(Scanner scn) {
		String text;
		text = scn.nextLine();
		return text;
	}
	
	private static void bucle(String name) {
		int edad = 22;
		for (int i = 0; i <= name.length()  ; i++) {
			System.out.println("Hola " + name + " " + edad);		
		}
	}
	
	private static void bucle(String name, int edad) {		
		edad = 18;
		for (int i = 0; i <= name.length()  ; i++) {
			System.out.println("Hola " + name + " " + edad);		
		}
	}
	
	
}
