package ejemplo5;
import java.util.Scanner;


public class ejemplo10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name, a1 , a2;
		char a,b,c;
		boolean r;
		System.out.println("Introduce tu nombre:");
		name = scn.nextLine();
		System.out.println("Introduce tu primer apellido:");
		a1 = scn.nextLine();
		System.out.println("Introduce tu segundo apellido:");
		a2 = scn.nextLine();
		
		a = name.charAt(0);
		b = a1.charAt(0);
		c = a2.charAt(0);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		System.out.println(name);
		r = name.equalsIgnoreCase(a1);
		
		System.out.println(r);
		if (r == true) {
			System.out.println("El nombre y el primer apellidos son iguales");
		}else {
			System.out.println("El nombre y el perimer apellidos son diferentes");
		}
		scn.close();
	}
}
