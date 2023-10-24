package ejemplo7;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		
		int numR,numU, i= 0;
		
		numR = rnd.nextInt(100);
		if(numR == 0) numR++;
		
		/*for (i = 0; i < 10; i++) {
			numU = Integer.parseInt(scn.nextLine());
			if (numR == numU) {
				System.out.println("GOOD! Has fallado " + i + " veces");
				break;
			}			
		}*/
		
		/*do {
			i++;
			System.out.println(numR);
			numU = Integer.parseInt(scn.nextLine());			
		} while (numR != numU && i < 10);
		if (numR == numU) {
			i--;
			System.out.println("GOOD! Has fallado " + i + " veces");			
		}*/
		
		numU = Integer.parseInt(scn.nextLine());			
		while (numR != numU && i < 10) {
			i++;
			numU = Integer.parseInt(scn.nextLine());			
		}
		if (numR == numU) {
			System.out.println("GOOD! Has fallado " + i + " veces");			
		}else if (i == 10) {
			System.out.println(numR);
			
		}	
		
		
		
		
		
		
	}
}
