package ejemplos9;

import java.util.Iterator;

public class EjerciciosMatriz06 {
	public static void main(String[] args) {
		EjerciciosMatriz06 obj = new EjerciciosMatriz06();
		EjerciciosMatriz02 rnd = new EjerciciosMatriz02();
		int max = 6, min=1; 
		int [][] matriz1 = new int[3][4];
		int [][] matriz2 = new int[4][3];
		matriz2 = obj.transponer(rnd.matrizRandomAsig(matriz1, max, min), matriz2);
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.printf("%4d", matriz2[i][j]);
			}
			System.out.println();
		}
		
	}
	
	private int[][] transponer(int [][] matriz1, int [][] matriz2) {
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				matriz2[i][j] = matriz1[j][i];
			}
		}
		return matriz2;
	}
}
