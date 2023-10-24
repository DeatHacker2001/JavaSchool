package ejemplo5;

import java.util.Scanner;

public class ejemplo9 {
 // Tiempo es = a distancia / velocidad
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		float v1, v2, vR, d, t, tM;
		System.out.println("Un Seat Leon sin tunear viaja a la valocidad maxima permitida en españa, y se encuentra a una distancia x de tu BMW M3 GTR(Tuneado) y "
				+ "tu como conductor imprudente al fin decides ir mas rapido de lo perimitido");
		System.out.println("Determina la distancia entre el seat y el bmw: ");
		d = scn.nextFloat();
		System.out.println("Determina la velocidad maxima a la que esta permitido viajar en españa");
		v1 = scn.nextFloat();
		System.out.println("Determina la velocidad que tu decides ir en tu coche");
		v2 = scn.nextFloat();
		vR = v2 - v1;
		t = d / vR;
		tM = t * 60f;
		System.out.println("JODER te demoras en alcanzarlo tan solo " + t + "Horas "+ " o " + tM + "Minutos");
		
		scn.close();
		
	}
}
