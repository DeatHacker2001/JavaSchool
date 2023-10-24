package ejemplo2;

import java.util.Scanner;

public class ejemplo1 {

	public static void main(String[] args) {
		String mensaje;
		int num;
		
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un n\u00famero ");
		num = tec.nextInt();
		
		mensaje = (num >= 0) ? "Positivo" : "Negativo";
		System.out.println("Has introducido un n\u00famero " + mensaje);
		tec.close();
	}

}
