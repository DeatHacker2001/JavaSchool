package ejemplos9;

import javax.swing.JOptionPane;

public class EjerciciosMatriz02 {
	public static void main(String[] args) {
		int num , numMax= 9, numMin = 1;
		EjerciciosMatriz02 obj = new EjerciciosMatriz02();
		int[][] matriz = new int[4][5];
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero del 1 al 9 para saber cual es su primera posicion en la matriz"));	
		} while (num > 9 || num < 1);
		
		obj.buscarNum(obj.matrizRandomAsig(matriz,numMax,numMin), num);
		
	}

	public int[][] matrizRandomAsig(int[][] matriz,int numMax, int NumMin) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * (numMax - NumMin) + NumMin);//cambiar
			}
		}
		return matriz;
	}

	private void buscarNum(int[][] matriz, int num) {
		boolean stop = false;

		for (int i = 0; i < matriz.length && !stop; i++) {
			for (int j = 0; j < matriz[i].length && !stop; j++) {
				if ((int) matriz[i][j] == num) {
					JOptionPane.showMessageDialog(null, "La primera posicion del numero en la matriz es [" + i + "]" + "[" + j + "]");
					stop = true;
				}
			}
		}
		if (!stop) {
			JOptionPane.showMessageDialog(null, "Ese valor no se a hallado");
		}

	}

}
