package ejemplos9;

import java.util.Iterator;

public class EjerciciosMatriz05 {
	public static void main(String[] args) {
		final int TM = 4, TM1 = 5;
		int max = 9, min = 0;
		int[][] matriz = new int[TM][TM1];
		EjerciciosMatriz05 obj = new EjerciciosMatriz05();
		EjerciciosMatriz02 rnd = new EjerciciosMatriz02();
		obj.calculo(rnd.matrizRandomAsig(matriz, max, min));

	}

	private void calculo(int[][] matriz) {
		int cont = 0;
		int temp = 0,temp1 = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				temp += matriz[j][i];
				System.out.println("Calculo column : " + "["+i+"]"+"["+j+"] " + temp);
				temp1 += matriz[i][j];
				System.out.println("Calculo fila : " + "["+i+"]"+"["+j+"] " + temp1);
			}
			temp = 0;
			temp1 = 0;
		}

	}
}
