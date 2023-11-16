package ejemplos9;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class EjerciciosMatriz07 {
	public static void main(String[] args) {
		EjerciciosMatriz07 obj = new EjerciciosMatriz07();
		obj.namesMatriz();
		
		
	}
	private void namesMatriz() {
		String[][] completeNames = new String[3][3];
		for (int i = 0; i < completeNames.length; i++) {
			for (int j = 0; j < completeNames[i].length; j++) {
				if (i == 0) {
					completeNames[i][j] = JOptionPane.showInputDialog("Introduce tu nombre");
				}else if (i == 1) {
					completeNames[i][j] = JOptionPane.showInputDialog("Introduce tu apellido1");
					
				}else if (i == 2) {
					completeNames[i][j] = JOptionPane.showInputDialog("Introduce tu apellido2");
					
				}
			}
			
		}

	}
	
	private void namesArrU() {
		final int TM = 3;
		int cont = 0;
		String [] names = new String[TM];
		String [] lsNames1 = new String[TM];
		String [] lsNames2 = new String[TM];
		String [] completeNames = new String[TM];
		
		
		do {			
			names[cont] = JOptionPane.showInputDialog("Introduce tu nombre") + " ";
			lsNames1[cont] = JOptionPane.showInputDialog("Introduce tu primer Apellido") + " ";
			lsNames2[cont] = JOptionPane.showInputDialog("Introduce tu segundo Apellido");
			
			completeNames[cont] = names[cont] + lsNames1[cont] + lsNames2[cont];
			cont++;
			
		} while (cont < names.length);
		
		JOptionPane.showMessageDialog(null, completeNames);
	}
}
