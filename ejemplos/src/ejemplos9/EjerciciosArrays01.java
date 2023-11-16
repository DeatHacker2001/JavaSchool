package ejemplos9;

import javax.swing.JOptionPane;

public class EjerciciosArrays01 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
		}
		int pos = Integer.parseInt(JOptionPane.showInputDialog("Dame una posicion del array para decirte el valor"));
		JOptionPane.showMessageDialog(null, "El numero del arrat para la posicion " + pos + " es " + arr[pos]);
	}
}
