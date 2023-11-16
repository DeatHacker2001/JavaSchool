package ejemplos9;

import javax.swing.JOptionPane;

public class EjerciciosMatriz03 {
	public static void main(String[] args) {
		// Ejercicio04
		int numMax = 100, numMin = 1;
		int[][] matriz = new int[6][8];
		EjerciciosMatriz02 rnd = new EjerciciosMatriz02();
		EjerciciosMatriz03 obj = new EjerciciosMatriz03();
		obj.findMaxMinValue(rnd.matrizRandomAsig(matriz, numMax, numMin));
	}

	private void findMaxMinValue(int matriz[][]) {
		int max, min;
		max = matriz[0][0];
		min = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] > max) {
					max = matriz[i][j];
				} else if (matriz[i][j] < min) {
					min = matriz[i][j];
				}
			}
		}
		JOptionPane.showMessageDialog(null, "El num mayor es: " + max + " El menor es: " + min);

	}
}
