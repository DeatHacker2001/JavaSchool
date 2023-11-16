package ejemplos9;

import java.util.Scanner;
public class EjercicioMatriz01 {
	public static void main(String[] args) {
		EjercicioMatriz01 obj = new EjercicioMatriz01();
		Scanner scn = new Scanner(System.in);
		int [][] matriz1, matriz2;
		int filas = 4, colmn = 4;
		matriz1 = new int[filas][colmn];
		matriz2 = new int[filas][colmn];
		obj.introducirNum(matriz1, matriz2, scn);		
		
	}
	private void introducirNum(int [][] matriz1, int [][] matriz2, Scanner scn) {
		int[][] matriz3 = new int[4][4];
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				matriz1[i][j] = (int)(Math.random()*(9 - 1)+1);
				matriz2[i][j] = (int)(Math.random()*(9 - 1)+1);
				
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
				System.out.printf("%3d ", matriz3[i][j]);
			}
			System.out.println();
			
		}
	}
}
