package ejemplo5;

import java.util.Scanner;

public class ejemplo15 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		short dSem;
		System.out.println("Introduce en numero un dia de la semana");
		dSem = scn.nextShort();
		if (dSem > 0 && dSem <= 7) {
			switch (dSem) {
			case 1:
				System.out.println("D");
				break;
			case 2:
				System.out.println("L");
				
				break;
			case 3:
				System.out.println("M");
				
				break;
			case 4:
				System.out.println("X");
				
				break;
			case 5:
				System.out.println("J");
				
				break;
			case 6:
				System.out.println("V");
				
				break;
			case 7:
				System.out.println("S");
				
				break;
			}
		}else {
			System.out.println("ERROR!");
		}
		scn.close();
		
	}
}
