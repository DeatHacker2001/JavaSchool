package cadenas;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		String[] aText = new String[3];//inicializamos el array que va almacenar la palabra que va a introducir el usuario
		String bblt = "AÄÁÂÀaàäáâÈËÉÊEeèëéêIÏÍÌÎïíìîiÖÓÒÔOóöòôoUÜÚÛÙuúüûù";//biblioteca de caracteres
		Ejercicio01 ejc01 = new Ejercicio01();//intanciamos la clase
		ejc01.leerCadena(aText, bblt);//llamamos al metodo dentro de la clase
	}

	public final void leerCadena(String aText[], String bblt) {
		
		int numVocal[] = new int[3];//array que cuenta el numero de vocales que hay en una palabra
		int cont = 0;//contador de vocales 
		String dialog[] = new String[3];//array que guarda el resultado de los 3 strings
		String utilChar[] = new String[aText.length];//array que guarda cuales fueron las vocales que contiene
		
		for (int i = 0; i < 3; i++) {//for para pedir 3 strings al user
			aText[i] = JOptionPane.showInputDialog("Introduce una cadena de caracteres");//pide y almacena strings en el array
			
			
			char x[] = new char[aText[i].length()];//array de caracteres para almacenar las vocales que se utilizaron en la palabra
				for (int k = 0; k < aText[i].length(); k++) {//for anidado que recorre la palabra
					for (int j = 0; j < bblt.length(); j++) {//for anidado que recorre la biblioteca
						if (aText[i].charAt(k) == bblt.charAt(j)) {//condicional para comparar cuando un caracter de la palabra se encuentra en la biblioteca
							x[cont] = bblt.charAt(j);//agrega al array que almacena caracteres el caracter coincidente con el encontrado
							cont++;//aumenta el contador a uno ya que encontro un caracter
							numVocal[i] = cont; //almacena la cantidad de vocales
						}
						
					}
				}				
				String text = new String(x);//intanciamos un string que recibe como parametro los caracteres almacenados en el array x
				utilChar[i] = text;//guardamos el texto en un array consecuente con el orden de la palabra introducida
			
			cont = 0;//inicializamos el contador a 0 para la siguiente palabra
		}
		for (int k = 0; k < 3; k++) {//for para recorrer el dialogo y alacenar en el los 3 resultados
			dialog[k] = " Hay en " + aText[k] + " vocales : " + numVocal[k] + " y son " + utilChar[k];
		}
		JOptionPane.showConfirmDialog(null, dialog);//muestra por pantalla los 3 resultados
		
	}

	

}
