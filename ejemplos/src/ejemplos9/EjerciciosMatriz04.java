package ejemplos9;


public class EjerciciosMatriz04 {

	public static void main(String[] args) {
		EjerciciosMatriz04 obj = new EjerciciosMatriz04();
		EjerciciosMatriz02 rnd = new EjerciciosMatriz02();
		final int tm = 5;
		int max = 10, min = 1;

		int[][] matriz = new int[tm][tm];
		obj.primDiag(rnd.matrizRandomAsig(matriz, max, min), tm);

	}

	private void primDiag(int[][] matriz, int tm) {
		
		int[] numSupDiag = new int[(int) ((Math.pow(tm, 2) - tm) / 2)];
		int[] numInfDiag = new int[(int) ((Math.pow(tm, 2) - tm) / 2)];
		int cont = 0, sumValInfD = 0, cont1 = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j > i) {
					numSupDiag[cont] = matriz[i][j];
					numSupDiag[cont] = (int) (Math.pow(numSupDiag[cont], 2));
					cont++;
				} else if (j < i) {
					sumValInfD += matriz[i][j];

				} else if (i == j) {
					matriz[i][j]++;
				} else if (i > j) {
					numInfDiag[cont1] = matriz[i][j] * 2;
				}
			}
		}
	}
}
