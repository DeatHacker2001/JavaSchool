package ejemplo8;

import javax.swing.JOptionPane;
import java.util.*;
public class Ejercicio02 {
	private final void randomNumber() {
		Random rnd = new Random();
		int lim1,lim2;
		int[] numRnd = new int[10];
		String[] dialog = new String[numRnd.length];
		lim1 = Integer.parseInt(JOptionPane.showInputDialog("Inrtoduce un limite inferior"));
		lim2 = Integer.parseInt(JOptionPane.showInputDialog("Inrtoduce un limite superior"));
		
		
		for (int i = 0; i < numRnd.length; i++) {
			numRnd[i] = rnd.nextInt((lim2 - lim1 + 1) + lim1);
			dialog[i] = "El numero random de la posicion " + i + " del array es " + numRnd[i] + " el tamaño del array es de " + numRnd.length;			
		}
		
		JOptionPane.showConfirmDialog(null, dialog);

	}
	
	
	public static void main(String[] args) {
		Ejercicio02 ejc02 = new Ejercicio02();
		ejc02.randomNumber();
		
		
		
	}
}
