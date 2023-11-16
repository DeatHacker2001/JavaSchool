package ejemplos9;

import javax.swing.JOptionPane;

public class EjerciciosArrays05 {

	public int[] convNeToArr(int num) {
		// Definimos las variables que vamos a utilizar
		int arr[];
		int cont = 0, num1;

		// Creamos un bucle para contar cuantos digitos contiene el numero
		while (Math.pow(10, cont) <= num) {
			cont++;
		}

		// Instanciamos el array definido anteriormente con longitud de la cantidad de
		// digitos
		arr = new int[cont];

		// Extraemos cada digito del numero pasado por parametro y lo asignamos en cada
		// una de las posiciones del array
		for (int i = 0; i < arr.length; i++) {
			cont--;
			num1 = num/(int)(Math.pow(10, cont));
			num -= num1*(int)(Math.pow(10, cont));
			arr[i] = num1;
		}

		return arr;
	}

	private void isCapicua(int[] arr) {
		// Definimos e intanciamos los arrays y variables que se van a utilizar
		int secArr[] = new int[arr.length];
		int cont = arr.length - 1;
		boolean isCap = false;

		// Recorre y asigna el ultimo valor del array que pasamos como parametro a
		// secArr
		for (int i : arr) {
			secArr[cont] = i;
			cont--;
		}

		// Bucle que recorre arrays y los compara
		for (int i = 0; i < secArr.length; i++) {
			if (arr[i] == secArr[i]) {
				isCap = true;
			} else {
				isCap = false;
			}
		}

		// Condicionalmente tiene que ser verdadero para que se muestre el mensaje
		if (isCap) {
			JOptionPane.showMessageDialog(null, "IsCapicua");
		} else {
			JOptionPane.showMessageDialog(null, "No es Capicua");

		}
	}

	public static void main(String[] args) {
		// Instanciamos la clase
		EjerciciosArrays05 obj = new EjerciciosArrays05();
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

		obj.isCapicua(obj.convNeToArr(num));
	}
}
