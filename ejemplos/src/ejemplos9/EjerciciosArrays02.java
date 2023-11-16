package ejemplos9;

import javax.swing.JOptionPane;

public class EjerciciosArrays02 {
	public static void main(String[] args) {
		
		int[] arr1;
		int cont = 0;
		int tm = Integer.parseInt(JOptionPane.showInputDialog(null, "Introudce un tamaño para el array"));
		arr1 = new int[tm];
		char[] ch = {'a', 'b'};
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random()*(300 - 1) + 1);			
		}
		
		int[] arr2;
		int cf = Integer.parseInt(JOptionPane.showInputDialog(null, "Introudce un numero de una cifra para hallar los numeros con esta terminacion dentro del array"));
		
		for (int i : arr1) {
			if (i % 10 == cf) {
				cont++;
			}
			System.out.println("arr1 : " + i);
		}
		
		System.out.println("\n");
		arr2 = new int[cont];
		cont = 0;
		
		for (int j = 0; j < arr1.length; j++) {
			if (arr1[j] % 10 == cf) {
				arr2[cont] = arr1[j];
				System.out.println("arr2 : " + arr2[cont]);
				cont++;
			}
		}
		
//		String str="";
//		str = str.concat(cont + "" + ch[0]);
//		System.out.println(str);
		
		
	}
}
