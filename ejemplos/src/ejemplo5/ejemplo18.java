package ejemplo5;

import java.util.Scanner;

public class ejemplo18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r,b=0,c=0,d;
		String a;
		System.out.println("Introduce una serie de numeros para hallar su media total, cuando se introduzca un cero el programa finalizara");
		a = scn.nextLine();
		if (a.equals(" ")) {
			r = 0;
		}else {
			r = Integer.parseInt(a); 			
		}
		
		if (r != 0){
			while (r!=0) {
				b= r+ b;
				c++;
				System.out.println("Introduce una serie de numeros para hallar su media total, cuando se introduzca un cero el programa finalizara");
				a = scn.nextLine();
				if (a.equals(" ")) {
					r = 0;
				}
				r = Integer.parseInt(a); 
				d= b/ c;
				System.out.println("La media total es de " + d);
				scn.close();
			}
		}else {
			System.out.println("ERROR has introducido");
		}
		
		 
		
	}
}
