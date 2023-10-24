package ejemplo5;

import java.util.Scanner;

public class ejemplo11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String pass;
		System.out.println("Introduce una contraseña segura para tu cuenta:");
		pass = scn.nextLine();
		if (pass.length() <= 8 || pass == pass.toLowerCase() || pass.length() <= 8 && pass == pass.toLowerCase() ) {
			System.out.println("Tu contraseña no es segura");
		}else {
			System.out.println("Tu contraseña es segura ;) dentro de lo que cabe claro ningun algortimo es 100% seguro");
		}
		scn.close();
	}
}
