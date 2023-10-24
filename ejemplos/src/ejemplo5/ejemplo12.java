package ejemplo5;
//import java.util.Random;
import java.util.Scanner;
public class ejemplo12 {
	public static void main(String[] args) {
		//Las siguientes lineas responden al ejercicio 6 de las condicionales
		Scanner scn = new Scanner(System.in);
		//Random rnd = new Random();
		
		String srt;
		//int a, b;
		System.out.println("escribe una palabra:");
		srt = scn.nextLine();
		if (srt == srt.toLowerCase()) {
			System.out.println("El String escrito esta en minusculas");
		}else {
			System.out.println("El String escrito contiene mayusculas");
		}
		System.out.println("Introduce un numero");
		
		/*a = rnd.nextInt(2);
		System.out.println(a);*/
		scn.close();
	}
}
